package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("32eqs");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1235dfed");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();  // popup handle accept kara h
		driver.switchTo().alert().dismiss();   // popup hataya hai 
		Thread.sleep(3000);
		System.out.println("popup will be handle Succesfully.......");
		driver.quit();
		
	}

}
