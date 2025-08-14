package Mock;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class JavaScriptExecuter {

	@Test
	public void show() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://49.249.28.218:8888/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		jse.executeScript("document.getElementsByName('user_name').value='admin';\r\n"	+ "");
		jse.executeScript("document.getElementsByName('user_password').value='admin';\r\n"+ "");
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
