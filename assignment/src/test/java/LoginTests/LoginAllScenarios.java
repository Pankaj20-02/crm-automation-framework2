package LoginTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginAllScenarios {
	
	 WebDriver driver;
	 @Test
	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.instagram.com/"); // अपने login page का URL डालें
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] getData() {
	        return new Object[][] {
	                // Positive
	                {"admin", "admin123", "valid"},
	                
	                // Negative
	                {"admin", "wrongPass", "invalid"},
	                {"wrongUser", "admin123", "invalid"},
	                {"wrongUser", "wrongPass", "invalid"},
	                {"", "", "blankBoth"},
	                {"", "admin123", "blankUsername"},
	                {"admin", "", "blankPassword"},
	                {"Admin", "Admin123", "caseCheck"},
	                {"admin' OR '1'='1", "anything", "sqlInjection"},
	                {"<script>alert(1)</script>", "test", "xssAttack"}
	        };
	    }

	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password, String type) throws InterruptedException {
	        // Username डालना
	        WebElement userField = driver.findElement(By.id("username"));
	        userField.clear();
	        userField.sendKeys(username);

	        // Password डालना
	        WebElement passField = driver.findElement(By.id("password"));
	        passField.clear();
	        passField.sendKeys(password);

	        // Login क्लिक
	        driver.findElement(By.id("loginBtn")).click();

	        Thread.sleep(1500);

	        // Assertions
	        switch (type) {
	            case "valid":
	                String actualURL = driver.getCurrentUrl();
	                Assert.assertTrue(actualURL.contains("dashboard"), "Valid credentials failed to login!");
	                break;

	            case "invalid":
	                String invalidMsg = driver.findElement(By.id("error")).getText();
	                Assert.assertEquals(invalidMsg, "Invalid username or password", "Invalid login message mismatch!");
	                break;

	            case "blankBoth":
	                String bothBlankMsg = driver.findElement(By.id("error")).getText();
	                Assert.assertTrue(bothBlankMsg.contains("required"), "Both fields blank message not shown!");
	                break;

	            case "blankUsername":
	                String blankUserMsg = driver.findElement(By.id("error")).getText();
	                Assert.assertTrue(blankUserMsg.contains("Username is required"), "Blank username message not shown!");
	                break;

	            case "blankPassword":
	                String blankPassMsg = driver.findElement(By.id("error")).getText();
	                Assert.assertTrue(blankPassMsg.contains("Password is required"), "Blank password message not shown!");
	                break;

	            case "caseCheck":
	                String caseMsg = driver.findElement(By.id("error")).getText();
	                Assert.assertEquals(caseMsg, "Invalid username or password", "Case sensitivity not handled properly!");
	                break;

	            case "sqlInjection":
	                String sqlMsg = driver.findElement(By.id("error")).getText();
	                Assert.assertEquals(sqlMsg, "Invalid username or password", "SQL Injection vulnerability found!");
	                break;

	            case "xssAttack":
	                String xssMsg = driver.findElement(By.id("error")).getText();
	                Assert.assertEquals(xssMsg, "Invalid username or password", "XSS vulnerability found!");
	                break;
	        }
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
