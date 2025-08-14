package DayTwo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class threadPoolSize {
	@Test(invocationCount = 5,threadPoolSize = 5)
	
	public void create() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Create Noida",true);
		Thread.sleep(1000);
		driver.quit();
	}
	

	@Test(enabled = false)
	public void delete() {
		Reporter.log("Manali",true);
	}

}
