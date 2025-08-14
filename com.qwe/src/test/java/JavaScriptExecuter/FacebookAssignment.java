package JavaScriptExecuter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		jse.executeScript("window.location='https://www.facebook.com/r.php?entry_point=login';");
		WebElement custom = driver.findElement(By.xpath("//input[@type='radio' and @value=\"-1\"]"));
		jse.executeScript("arguments[0].click();",custom);
		WebElement optional = driver.findElement(By.xpath("//input[@type='text' and @id='custom_gender']"));
		jse.executeScript("arguments[0].value='male';",optional);
			}

}
