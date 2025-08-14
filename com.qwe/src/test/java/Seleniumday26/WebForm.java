package Seleniumday26;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;     
import org.openqa.selenium.WebElement;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class WebForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement webDD = driver.findElement(By.name("my-select"));
		Select sel = new Select(webDD);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement webDD2 = driver.findElement(By.name("my-datalist"));
		Select sel2 = new Select(webDD2);
		//sel2.selectByValue("Seattle");
		sel2.selectByVisibleText("New York");
		Thread.sleep(4000);
		driver.quit();
	}

}
