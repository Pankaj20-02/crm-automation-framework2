package ThirdDay;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ContactUsingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\shivam upadhyay\\eclipse-workspace\\Contacts\\src\\test\\resources\\testscriptS.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		// Create method will not create anything									// It will open the workbook in read-mode
			
			//	Sheet sh = wb.getSheet("Contacts");
				
			//	Row row = sh.getRow(4);
				
			//	Cell cell = row.getCell(0);
				
			//	String data = cell.getStringCellValue();
				
			String lastname = wb.getSheet("Contacts").getRow(2).getCell(1).getStringCellValue();
			System.out.println(lastname);
			
			String firstname = wb.getSheet("Contacts").getRow(3).getCell(2).getStringCellValue();
			System.out.println(firstname);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://49.249.28.218:8888/");
		 WebElement us = driver.findElement(By.name("user_name"));
		 us.sendKeys("admin");
		 
		 WebElement ps = driver.findElement(By.name("user_password"));
		 ps.sendKeys("admin");
		 driver.findElement(By.id("submitButton")).click();
		 
		// click on context 
			driver.findElement(By.linkText("Contacts")).click();
			
			driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
			
			driver.findElement(By.name("firstname")).sendKeys("firstname");
			
			driver.findElement(By.name("lastname")).sendKeys(lastname);
			
			driver.findElement(By.name("title")).sendKeys("project");
			
			driver.findElement(By.id("department")).sendKeys("IT Department");
			
			driver.findElement(By.id("email")).sendKeys("pankahg876@gmail.com");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Actions ac=new Actions(driver);
			WebElement accout=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px' and @src='themes/softed/images/user.PNG']"));
			ac.moveToElement(accout).build().perform();
			
			driver.findElement(By.linkText("Sign Out")).click();  
			driver.quit();
	}

}
