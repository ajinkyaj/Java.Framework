package Ajinkya.Framework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BrowserOperations {
	
	public WebDriver driver;
	
	public WebDriver initializeDefaultDriver() throws IOException //Setting up browser driver via data file
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("\\Java.Framework\\DataFiles\\browser.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		return driver = BrowserObject.setBrowser(browserName);
	}
	public WebDriver initializeUserDriver(String browserName)
	{
		//BrowserObject BO = new BrowserObject();
		return driver = BrowserObject.setBrowser(browserName);
		
	}
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}

}
