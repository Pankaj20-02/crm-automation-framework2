package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathLocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivam%20upadhyay/Downloads/assignment.html#");
		driver.findElement(By.xpath("//td[@Jethalal='td']")).click();
		driver.findElement(By.xpath("//td[@34='td']"));
		driver.findElement(By.xpath("//td[@UK='td']"));
		driver.findElement(By.xpath("//td[@Australia='td']")).click();
		Thread.sleep(4000);
		driver.quit();

		
	}

}
