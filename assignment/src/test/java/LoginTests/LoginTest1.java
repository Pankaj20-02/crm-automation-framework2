package LoginTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest1 {
	
	WebDriver driver;
	@Test
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/"); // यहाँ अपनी login page URL डालें
    }

    @Test(priority = 1)
    public void validLoginTest() throws InterruptedException {
        // Username डालें
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("admin");

        // Password डालें
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("admin123");

        // Login button क्लिक करें
        driver.findElement(By.id("u_0_5_C0")).click();

        // थोडा wait ताकि result दिखे
        Thread.sleep(2000);

        // Assertion: Login success message
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains("dashboard"), "Login failed for valid credentials!");
    }

    @Test(priority = 2)
    public void invalidLoginTest() throws InterruptedException {
        // Username डालें
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("wrongUser");

        // Password डालें
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("wrongPass");

        // Login button क्लिक करें
        driver.findElement(By.id("u_0_5_C0")).click();

        // थोडा wait ताकि result दिखे
        Thread.sleep(5000);

        // Assertion: Error message दिखाई दे
        String errorMsg = driver.findElement(By.id("error")).getText();
        Assert.assertEquals(errorMsg, "Invalid username or password", "Error message mismatch!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
