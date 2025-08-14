package com.qwe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement username= driver.findElement(By.id("twotabsearchtextbox"));
		username.sendKeys("Laptop");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
