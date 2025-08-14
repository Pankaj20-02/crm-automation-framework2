package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Pankaj upadhyay");
		driver.findElement(By.xpath("//input[@aria-label = 'Password']")).sendKeys("Pabk36435");
		driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x15mokao x1ga7v0g x16uus16 xbiv7yw x1xmf6yo x1e56ztr x11hdunq x11gldyt x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[@class= 'xvs91rp xwhw2v2 x2ltsn7']")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'x1i10hfl ')]")).click();
		driver.findElement(By.xpath("//input[@class= '_aaie _aaig _adrq _aaic _ag7n']")).sendKeys("pankaj");
		// You must log in to continue.page
		driver.findElement(By.xpath("//div[@class = 'pam _9ay2 uiBoxYellow']")).click();
		//driver.findElement(By.id("email")).sendKeys("pankaj5432@gmail.com");
		//driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("pankae34@gmail.com");
		Thread.sleep(7000);
		driver.quit();
	}

}
