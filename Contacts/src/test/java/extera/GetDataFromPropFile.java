package extera;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\shivam upadhyay\\eclipse-workspace\\Contacts\\src\\test\\resources\\commonData.Properties");
		
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String BROWSER = pobj.getProperty("bro");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("un");
		String PASSWORD = pobj.getProperty("pwd");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}

}
