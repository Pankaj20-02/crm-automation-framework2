package com.qwe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://www.shoppersstack.com/products_page/113");
		driver.findElement(By.id("Check Delivery")).sendKeys("201301");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Buy Now"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Email")));
		driver.findElement(By.id("Email")).click();

		// wait.until(ExpectedConditions.alertIsPresent(By.name("Buy Now")));
		driver.findElement(By.id("Check")).click();
	}

}
