package Ajinkya.Framework;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GoogleTest extends BrowserOperations{
	
	@Test
	public void OpenGoogle() throws IOException
	{
		driver = initializeDefaultDriver();
		driver.get("https:\\www.google.com");
		WebElement test = driver.findElement(By.id("_eEe"));
		if(TextEqual(test, ""))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		driver.close();
		
	}
}
