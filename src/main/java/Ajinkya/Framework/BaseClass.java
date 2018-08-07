package Ajinkya.Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

class BaseClass {
	
	@Test
	private WebDriver invokeBrowser(String browser) throws IOException
	{
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("");
		prop.load(fis);
		if(browser.equals("default"))
			browser = prop.getProperty("browserName");
		
		switch(browser)
		{
		case "firefox": 
		return driver = new FirefoxDriver();
		
		case "chrome": 
			System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		return driver = new ChromeDriver();
		
		default :
			System.out.println("Invalid value for browser name");
			System.exit(0);
			return null;
		}
	}

}
