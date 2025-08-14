package com.qwe;
import org.openqa.selenium.By;  // (ye assignment humna name ki help see kiya hai)
import org.openqa.selenium.WebDriver;      
import org.openqa.selenium.WebElement;   
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorAssignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys("pankaj upadhyay");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("fddquyu663");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
		driver.findElement(By.linkText("Forgottpassworden")).click();
		Thread.sleep(8000);
	}

}
