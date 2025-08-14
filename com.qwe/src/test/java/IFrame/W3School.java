package IFrame;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class W3School {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		//WebElement frame=driver.findElement(By.xpath("//div[@id='iframewrapper']/child::iframe"));
	    driver.switchTo().frame("iframeResult");
		WebElement subimt = driver.findElement(By.xpath("//input[@type='submit']"));
		subimt.click();		
		driver.quit();
	}

}
