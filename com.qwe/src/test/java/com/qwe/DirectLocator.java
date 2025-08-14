package com.qwe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;      // ye webdriver ka liya hai
import org.openqa.selenium.WebElement;    // ye webelement ka liya hai
import org.openqa.selenium.chrome.ChromeDriver;  // ye chromedriver ka liya hai

public class DirectLocator {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("amit kumar");
		Thread.sleep(4000);
		driver.findElement(By.name("pass")).sendKeys("4563373645");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgottpassworden ?")).click();
		Thread.sleep(6000);
		driver.quit();
		
	}

}
