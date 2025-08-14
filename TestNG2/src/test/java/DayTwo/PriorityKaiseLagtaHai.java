package DayTwo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKaiseLagtaHai {
	@Test(priority = -1)
	public void create() {
		Reporter.log("Noida",true);
	}
	
	@Test(priority = 0)
	public void modify() {
		Reporter.log(" Grater Noida",true);
	}
	
	@Test(priority = 2)
	public void delete() {
		Reporter.log("Delhi",true);
	}
}
