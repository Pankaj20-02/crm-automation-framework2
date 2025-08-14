package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String getDataFromPropertiesFile(String keys) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\shivam upadhyay\\eclipse-workspace\\Contacts\\src\\test\\resources\\commonData.Properties");
		
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String value = pobj.getProperty(keys);
		return value;
		
	}
	public String getDataFromExcelFile(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
//		Get the data from excel file
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\User\\git\\E3_Vtiger_CRM\\Vtiger-CRM-E3-FW\\src\\test\\resources\\testScriptData.xlsx");

		Workbook wb = WorkbookFactory.create(fis2);
		String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}

}

