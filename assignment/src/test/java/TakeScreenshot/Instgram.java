package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Instgram {
	@Test
	public void show() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shivam upadhyay\\eclipse-workspace\\assignment\\src\\test\\java\\TakeScreenshot\\inss.png");
		FileHandler.copy(source, destination);
		
		System.out.println("Instgram ScreenShot is succesfully take it");
		//Thread.sleep(3000);
		driver.quit();
		
	}
}
