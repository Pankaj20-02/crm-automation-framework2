package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathSurrounding {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		//driver.findElement(By.xpath("//select[text()='Oct']//option[@value='Month']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Male']//input[@type='radio']")).click();
		Thread.sleep(5000);
		
		
		
	}

}
