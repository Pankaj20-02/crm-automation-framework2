package DemoWebsites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import repositery.Health;
public class HealthCareServices {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		
		//driver.findElement(By.id("txt-username")).sendKeys("John Doe");
	//	driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		Health h = new Health(driver);
		h.getUsername().sendKeys("John Doe");
		h.getPassword().sendKeys("ThisIsNotAPassword");
		h.getLoginbtn().click();
			
	}

}
