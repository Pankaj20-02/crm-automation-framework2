package repositeryByNikhil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class homepage1 {
//	Initialization
	public homepage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	/*@FindBy(linkText="Contacts")//second object create
	private WebElement contacts;
	
	public WebElement getcontacts() {
		return contacts;
		
	}*/
	
	@FindAll(
			{
				@FindBy(linkText="Contacts"),
				@FindBy(css="a[href='index.php?module=Contacts&action=index']")
			}
			
			
			)
	private WebElement contacts;
	public WebElement getcontacts() {
		return contacts;
		
	}
	@FindAll(
			{
				@FindBy(css="img[alt='Create Contact...']"),
				@FindBy(xpath="//img[@title='Create Contact...']")
				
			}
			
			)
	private WebElement plusicon;
	
	
	//@FindBy(css="img[alt='Create Contact...']")
//	private WebElement plusicon;
	
	public WebElement getplusicon()
	{ return plusicon;
	}
	
	@FindAll(
			{
			@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']"),	
			@FindBy(css="img[style='padding: 0px;padding-left:5px']")	
			}
			
			)private WebElement accout;
	
//	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
//	private WebElement accout;
	
	public WebElement getaccout()
	{ return accout;
	}

	@FindAll(
			{
			@FindBy(linkText="Sign Out"),
			@FindBy(css="a[href='index.php?module=Users&action=Logout']")
			
			}
			
			)
//	@FindBy(linkText="Sign Out")
	private WebElement signout;
	
	public WebElement getsignout()
	{ return signout;
	}
	
}
