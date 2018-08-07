package Ajinkya.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class Utilities {
	
	WebDriver driver;
	
	
	public void ScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot scrShot;
		scrShot  = ((TakesScreenshot)driver);							//Convert web driver object to TakeScreenshot
		File srcFile =  scrShot.getScreenshotAs(OutputType.FILE);		//Call getScreenshotAs method to create image file
		File destFile = new File("");									//Move image file to new destination
		FileUtils.copyFile(srcFile, destFile);
	}
}
