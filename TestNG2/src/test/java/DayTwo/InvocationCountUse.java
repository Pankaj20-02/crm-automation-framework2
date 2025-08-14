package DayTwo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountUse {
	@Test(invocationCount = 10)
	public void create() {
		Reporter.log("Noida",true);
	}
	
	
	@Test(enabled = false)
	public void delete() {
		Reporter.log("Manali",true);
	}

}
