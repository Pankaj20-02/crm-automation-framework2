package Mock;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenshot {
@Test

	
	public void screenshot() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shivam upadhyay\\eclipse-workspace\\com.qwe\\src\\test\\java\\TakeScreenshot\\ss1.png");
		FileHandler.copy(source, destination);
	}
}
