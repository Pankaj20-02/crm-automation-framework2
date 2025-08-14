package Selenium.ProjectPK;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Sbi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(13));
		driver.get("https://yonobusiness.sbi/yonobusinesslogin");
		driver.findElement(By.id("userName")).sendKeys("Rohit Sharma");
		driver.findElement(By.id("password")).sendKeys("admine@123");
		WebElement eye = driver.findElement(By.className("shownhide"));
		//.findElement(By.xpath("//button[@tabindex= '0']")).click();
		Actions act = new Actions(driver);
		act.clickAndHold(eye).build().perform();
		Thread.sleep(4000);
		//driver.findElement(By.className("loginbutton_without_dropdown ng-star-inserted")).click();
		act.release().build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
