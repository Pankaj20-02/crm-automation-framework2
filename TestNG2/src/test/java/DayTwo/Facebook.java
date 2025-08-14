package DayTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	
	@Test(invocationCount = 4)
	public void LoginFbTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin");
		loginBtn.click();
		
		Thread.sleep(3000);
		driver.quit();
		



	}
}
