package TakeScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Facebook {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		 
		//Taking screenshot on a webpage
		TakesScreenshot tks = (TakesScreenshot)driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shivam upadhyay\\eclipse-workspace\\com.qwe\\src\\test\\java\\TakeScreenshot\\ss2.png");
		FileHandler.copy(source, destination);
		
		//Taking screenshot on a webelement(like->facebook loginbutton)
	WebElement loginbtn =driver.findElement(By.name("login"));
	File source3 = loginbtn.getScreenshotAs(OutputType.FILE);
	File destination3 = new File("C:\\Users\\shivam upadhyay\\eclipse-workspace\\com.qwe\\src\\test\\java\\TakeScreenshot\\webelement.png");
	FileHandler.copy(source3, destination3);

	}

}
