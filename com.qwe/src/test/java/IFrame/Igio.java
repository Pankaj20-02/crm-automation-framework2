package IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Igio {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ixigo.com/");
		driver.switchTo().frame("wiz-iframe-intent");
		WebElement subimt = driver.findElement(By.xpath("//input[@type='submit']"));
		subimt.click();		
		driver.quit();
	}

}
