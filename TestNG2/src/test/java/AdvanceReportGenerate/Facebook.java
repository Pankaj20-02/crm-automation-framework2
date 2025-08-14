package AdvanceReportGenerate;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Facebook {
	@Test
	public void adRep() {
		ExtentSparkReporter spark = new ExtentSparkReporter ("C:\\Users\\shivam upadhyay\\eclipse-workspace\\TestNG2\\AdvanceRepote\\rep1.html");
		
		spark.config().setDocumentTitle("FirstTimeRepoteGenerate");
		spark.config().setReportName("Beginning");
		spark.config().setTheme(Theme.STANDARD);
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Browser", "chrome");
		report.setSystemInfo("version", "133");
		report.setSystemInfo("window", "11");
		report.setSystemInfo("IDE", "Eclipse");
		
		ExtentTest test = report.createTest("Method");
		test.log(Status.INFO, "This is information");
		test.log(Status.SKIP, "This is information");
		test.log(Status.WARNING, "This is information");
		test.log(Status.PASS, "This is information");
		test.log(Status.FAIL, "This is information");
		
		report.flush();
		
	}
	
}
