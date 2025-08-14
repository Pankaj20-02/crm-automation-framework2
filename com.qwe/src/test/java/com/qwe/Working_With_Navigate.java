package com.qwe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class Working_With_Navigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sing up")).click();
		Thread.sleep(4000);
	    Navigation nav =	driver.navigate();
	    nav.back();
	    Thread.sleep(3000);
	   // nav.forward();
	  //  Thread.sleep(3000);
	  //  nav.refresh();
	  //  Thread.sleep(3000);
	    driver.quit();
	}

}
