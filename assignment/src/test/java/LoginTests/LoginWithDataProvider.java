package LoginTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginWithDataProvider {
	
	 WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/"); // अपनी login page URL डालें
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] getData() {
	        return new Object[][] {
	                {"admin", "admin123", "valid"},
	                {"wrongUser", "wrongPass", "invalid"},
	                {"", "", "blank"}
	                
	        };
	    }
	    

	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password, String type) throws InterruptedException {
	        // Username डालें
	    	
	        WebElement userField = driver.findElement(By.id("username"));
	        userField.clear();
	        userField.sendKeys(username);

	        // Password डालें
	        WebElement passField = driver.findElement(By.id("password"));
	        passField.clear();
	        passField.sendKeys(password);

	        // Login button क्लिक करें
	        driver.findElement(By.id("loginBtn")).click();

	        Thread.sleep(2000);

	        if (type.equals("valid")) {
	            String actualURL = driver.getCurrentUrl();
	            Assert.assertTrue(actualURL.contains("dashboard"), "Login failed for valid credentials!");
	        }
	        else if (type.equals("invalid")) {
	            String errorMsg = driver.findElement(By.id("error")).getText();
	            Assert.assertEquals(errorMsg, "Invalid username or password", "Error message mismatch!");
	        }
	        else if (type.equals("blank")) {
	            String errorMsg = driver.findElement(By.id("error")).getText();
	            Assert.assertTrue(errorMsg.contains("required"), "Blank field validation not shown!");
	        }
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
