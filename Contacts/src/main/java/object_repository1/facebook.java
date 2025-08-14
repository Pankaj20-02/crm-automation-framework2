package object_repository1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {
	
	public facebook(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
		@FindBy(id="email")
		 private WebElement username;
		
		 public WebElement getusername()
		{
			return username;
		}
}

