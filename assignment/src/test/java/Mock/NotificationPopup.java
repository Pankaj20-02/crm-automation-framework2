package Mock;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NotificationPopup {
	@Test
	public void show() throws InterruptedException {
		
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
