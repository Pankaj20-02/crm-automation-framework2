package repositeryByNikhil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginpage {
	
//	Initialization
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="user_name")//items object create
	private WebElement Username;
	
	
	@FindBy(name="user_password")
	private WebElement Password;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	
	public WebElement getUsername() {
		return Username;
		
	}
	public WebElement getPassword() {
		return Password;
		
	}
	public WebElement getloginbtn() {
		return loginbtn;
		
	}
	
}
