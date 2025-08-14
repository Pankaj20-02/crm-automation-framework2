package repositeryByNikhil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage2 {
	public homepage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindAll(
			{
				@FindBy(name="firstname"),	
				
			}
			
			) private WebElement firstname;
	
	//@FindBy(name="firstname")//third object create
	// private WebElement firstname;
	
	public WebElement getfirstname()
	{
		return firstname;
		
	}
	
	@FindBy(name="lastname")
	 private WebElement lastname;
	public WebElement getlastname()
	{
		return lastname;
		
	}
	@FindBy(id="title")
	 private WebElement title;
	public WebElement gettitle()
	{
		return title;
		
	}
	@FindBy(id="department")
	 private WebElement department;
	public WebElement getdepartment()
	{
		return department;
		
	}
	
	@FindBy(name="email")
	 private WebElement email;
	public WebElement getemail()
	{
		return email;
		
	}
	@FindBy(xpath="//input[@title='Save [Alt+S]' and @class='crmButton small save']")
	 private WebElement save;
	public WebElement getsave()
	{
		return save;
		
	}
}
