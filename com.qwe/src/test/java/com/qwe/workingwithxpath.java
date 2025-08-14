package com.qwe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class workingwithxpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("psqhjdjj");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("psqhjdjj");
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rohit@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gyeggtffyu");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//a[@role='button]")).click();
	}

}
