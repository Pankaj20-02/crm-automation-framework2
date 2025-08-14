package listeners_utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base_utility.BaseClass1;

public class List_imp implements ITestListener, ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("DB connectivity + Rep config");
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "started executing");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "got passwed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "got failed and need to take ss");
		
		
		TakesScreenshot tks = (TakesScreenshot) BaseClass1.sdriver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\shivam upadhyay\\eclipse-workspace\\TestNG2\\errorShots\\ss1.png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "got skipped");
	}
	@Override
	public void onFinish(ISuite suite) {
		System.out.println("DB close + report backup");
	}
	
}
