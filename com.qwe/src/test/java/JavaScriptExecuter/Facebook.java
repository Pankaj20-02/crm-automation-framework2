package JavaScriptExecuter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('email').value='admin';\r\n"	+ "");
		jse.executeScript("document.getElementById('pass').value='admin';\r\n"	+ "");
		
	WebElement loginbtn =driver.findElement(By.name("login"));
	//loginbtn.click();         // (ye maine JAVA or SELENIUM ki helps see kara tha)
	
	jse.executeScript("arguments[0].click()",loginbtn);   // <-ye maine javascript ki help se kiya hai
	
		Thread.sleep(4000);
		driver.quit();
	}

}
