package Ajinkya.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BrowserObject {

	static WebDriver driver;
	public static WebDriver setBrowser(String browserName)
	{
		if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
}
