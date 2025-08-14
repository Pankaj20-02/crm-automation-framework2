package Popup;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuru99 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600);\r\n"		+ "");// scrolling ka liya use hota hai
		Thread.sleep(4000);
		WebElement web =	driver.findElement(By.xpath("//input[@type='submit']"));  // click by now
		web.click();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,300);\r\n"		+ ""); // scrolling ka liya use hota hai
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2356765");// ye card number 
		Thread.sleep(3000);
		// month ka liyaa code every select any month ya days
		
		WebElement monthDD= driver.findElement(By.id("month"));
		Select selmonth = new Select(monthDD);
		selmonth.selectByIndex(6);
		
		// year ka liyaa code every select any  year month ya days
		
		WebElement yearDD= driver.findElement(By.id("year"));
		Select selyear = new Select(yearDD);
		selyear.selectByIndex(8);
		 
		driver.findElement(By.id("cvv_code")).sendKeys("223"); // ye cvv code ka liya hai
		
		js.executeScript("window.scrollBy(0,100);\r\n"		+ ""); // ye maine fir see scrolling ka liya use kara hai
		driver.findElement(By.xpath("//input[@name='submit']")).click(); // click on pay button
		
		driver.switchTo().alert().accept();  // popup handle accept kara h
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();   // popup hataya hai 
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
