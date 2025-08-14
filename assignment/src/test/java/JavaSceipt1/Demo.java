package JavaSceipt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void Facebook()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.facebook.com/';");
		
		js.executeScript("document.getElementById('email').value='pankaj';\r\n"	+ "");
		js.executeScript("document.getElementById('pass').value='admin';\r\n"	+ "");
		
		js.executeScript("window.scrollBy(0,200);\r\n"	+ "");
	WebElement loginbt =driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click()",loginbt);
	
	System.out.println("javascriptExecutor succesfully run...");
	

	}

}
