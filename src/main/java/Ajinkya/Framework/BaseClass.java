package Ajinkya.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public WebDriver invokeBrowser(String browser)
	{
		WebDriver driver = null;
		switch(browser)
		{
		case "firefox": 
		return driver = new FirefoxDriver();
		
		case "chrome": 
			System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		return driver = new ChromeDriver();
		
		default :
			System.exit(0);
			return null;
		}
	}

}
