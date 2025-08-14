package drmo.com;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='oxd-glass-button orangehrm-upgrade-button']")).click();
		Thread.sleep(9000);
	//	driver.findElement(By.xpath("//a[@href='/open-source/upgrade-to-advanced#demo-submit']")).submit();
		Thread.sleep(7000);
		//driver.findElement(By.id("Form_getForm_Name")).sendKeys("Pankaj upadhyay");
		driver.quit();
		
	}

}
