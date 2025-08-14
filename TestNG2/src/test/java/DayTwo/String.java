package DayTwo;

import org.testng.annotations.Test;

public class String {
	@Test
	public Object[][] stringArray(){
		Object[][]student = new Object[5][2];
		
		student[0][0] = "Pankaj";
		student[0][1] = "upadhyay";
		
		student[1][0] = "amit";
		student[1][2] = "kumar";
		
		student[2][0] = "rohit";
		student[2][1] = "singh";
		
		student[3][0] = "nikhil";
		student[3][1] = "rawal";
		
		student[4][0] = "aman";
		student[4][1] = "kapasiya";
		
		return student;
	}
}
