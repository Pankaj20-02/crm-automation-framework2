package Working_With_Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_utility.BaseClass1;

@Listeners(listeners_utility.List_imp.class)// packagename.classname.class
public class DemoTest extends BaseClass1 {
	@Test
	public void vtiger1() 
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void vtiger2() 
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void vtiger() 
	{
		Assert.assertTrue(true);
	}
}
