package Ajinkya.Framework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BrowserOperations extends TextAssertion{
	
	public WebDriver driver;
	
	public WebDriver initializeDefaultDriver() throws IOException //Setting up browser driver via data file
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("\\Java.Framework\\DataFiles\\browser.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
	}
	public WebDriver initializeUserDriver(String browserName)
	{
		
	}

}
