package JavaScriptExecuter;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.swiggy.com/';");// ye javascript see buna get.()kiya hua hai 
		
		jse.executeScript("window.scrollBy(0,300);\r\n"+ "");  //this is scrooling the window home page
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,300);\r\n"+ "");  //this is scrooling the window home page
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,300);\r\n"+ "");   //this is scrooling the window home page

		Thread.sleep(4000);
		driver.quit();
	}

}
