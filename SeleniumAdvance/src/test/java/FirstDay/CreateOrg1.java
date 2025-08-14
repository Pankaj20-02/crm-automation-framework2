package FirstDay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CreateOrg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://49.249.28.218:8888/");
		 WebElement us = driver.findElement(By.name("user_name"));
		 us.sendKeys("admin");
		 
		 WebElement ps = driver.findElement(By.name("user_password"));
		 ps.sendKeys("admin");
		 driver.findElement(By.id("submitButton")).click();
		 
		// click on context 
			driver.findElement(By.linkText("Contacts")).click();
			
			driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
			
			driver.findElement(By.name("firstname")).sendKeys("Nikhil");
			
			driver.findElement(By.name("lastname")).sendKeys("Rawal");
			
			driver.findElement(By.name("title")).sendKeys("project");
			
			driver.findElement(By.id("department")).sendKeys("IT Department");
			
			driver.findElement(By.id("email")).sendKeys("pankahg876@gmail.com");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Actions ac=new Actions(driver);
			WebElement accout=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px' and @src='themes/softed/images/user.PNG']"));
			ac.moveToElement(accout).build().perform();
			
			driver.findElement(By.linkText("Sign Out")).click();
		
		
	}

}
