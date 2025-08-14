package Seleniumday26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pankaj");
		// driver.findElement(By.cssSelector("//input[type='text']")).sendKeys("comer");
		Thread.sleep(3000);
		// driver.quit();
		// this is for day
		WebElement dayDD = driver.findElement(By.id("day"));  // ye select karna kisi ko 
		Select selDay = new Select(dayDD);
		selDay.selectByIndex(3);

		// this is for month

		WebElement monthDD = driver.findElement(By.id("month"));
		Select selmonth = new Select(monthDD);
		selmonth.selectByIndex(8);
		List<WebElement> months = selmonth.getOptions();
		System.out.println(months.get(8).getText());

		for (WebElement i : months) {
			String text = i.getText();
			// System.out.println(text);

		}
		// this is for year

		WebElement yearDD = driver.findElement(By.id("year"));
		Select selyear = new Select(yearDD);
		selyear.selectByVisibleText("2018");

		Thread.sleep(3000);
		driver.quit();

	}

}
