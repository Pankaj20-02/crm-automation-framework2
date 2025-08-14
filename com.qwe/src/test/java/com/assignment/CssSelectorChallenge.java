package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssSelectorChallenge {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivam%20upadhyay/Downloads/assignment.html#");
		driver.findElement(By.cssSelector("//input[type ='text']")).sendKeys("class Name");
		driver.quit();
	}

}
