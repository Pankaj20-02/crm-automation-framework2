package object_repo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePagess {
	
//	Initialization
	public HomePagess(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText ="Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Calendar")
	private WebElement caleLink;

	@FindBy(linkText = "Contacts")
	private WebElement conLink;

	@FindBy(linkText = "Opportunities")
	private WebElement oppLink;

	@FindBy(linkText = "Products")
	private WebElement proLink;

	@FindBy(linkText = "Documents")
	private WebElement docLink;

	@FindBy(css = "img[src='themes/softed/images/user.PNG']")
	private WebElement profile;

	@FindBy(linkText = "Sign Out")
	private WebElement signOut;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getCaleLink() {
		return caleLink;
	}

	public WebElement getConLink() {
		return conLink;
	}

	public WebElement getOppLink() {
		return oppLink;
	}

	public WebElement getProLink() {
		return proLink;
	}

	public WebElement getDocLink() {
		return docLink;
	}
}
