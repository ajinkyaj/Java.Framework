package Ajinkya.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserObject{

	WebDriver driver;
	public WebDriver setBrowser(String browserName)
	{
		if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
}
