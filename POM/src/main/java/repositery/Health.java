package repositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Health {
	public Health(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txt-username")
	 private WebElement username;
	
	@FindBy(id="txt-password")
	 private WebElement password;
	
	@FindBy(id="btn-login")
	 private WebElement loginbtn;
	
	
	
	 public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
}
