package base_utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	@BeforeSuite
	public void repoConfig()
	{
		System.out.println("DB conn + Rep config..");		
	}
	
	@BeforeTest
	public void preCon()
	{
		System.out.println("pre Condition..");		
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser oprn..");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	@Test
	public void createOrg() {
		System.out.println("Perform task..");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void clodeBro() {
		System.out.println("Browser close..");
	}
	
	@AfterTest
	public void postCon() {
		System.out.println("post conditions");
	}
	
	@AfterSuite
	public void rebackup() {
		System.out.println("DB conn close + Rep Backup");
	}
}
