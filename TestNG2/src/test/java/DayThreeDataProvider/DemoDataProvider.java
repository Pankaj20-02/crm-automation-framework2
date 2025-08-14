package DayThreeDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@Test(dataProvider = "getData") 
	public void loginToFB(String user,String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(user  + "is logged in SucessFully...");
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][]student = new Object[5][2];
		
		student[0][0] = "Pankaj";
		student[0][1] = "upadhyay";
		
		student[1][0] = "amit";
		student[1][1] = "kumar";
		
		student[2][0] = "rohit";
		student[2][1] = "singh";
		
		student[3][0] = "nikhil";
		student[3][1] = "rawal";
		
		student[4][0] = "aman";
		student[4][1] = "kapasiya";
		return student;
	}
}
