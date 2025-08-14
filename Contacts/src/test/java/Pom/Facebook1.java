package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import object_repository1.facebook;

public class Facebook1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		facebook fb = new facebook(driver);
		fb.getusername().sendKeys("admin");
		
	}

}
