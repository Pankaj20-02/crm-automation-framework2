package Seleniumday26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement weldd = driver.findElement(By.className("form-select"));
		Select sel = new Select(weldd);
		Boolean status = sel.isMultiple();
		System.out.println(status);
		sel.selectByValue("One");
		sel.selectByVisibleText("3");
		Thread.sleep(5000);
		driver.quit();
	}

}
