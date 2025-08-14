package DayOne;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Browser {
	
	@Test
	public void caes1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//System.out.println("Console");
		Reporter.log("CONSOLE...");
		driver.quit();
		
	}

	@Test
	public void caes2() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		Reporter.log("REPOET MAI LIKHA JAYEGA...");
		driver.quit();
		
	}
}
