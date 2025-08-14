package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivam%20upadhyay/Downloads/assignment.html#");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.className("btn-class")).click();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("Idhar")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
