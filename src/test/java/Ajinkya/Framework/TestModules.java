package Ajinkya.Framework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestModules extends TextAssertion{
@Test
public void test()
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https:\\www.google.co.in");
	WebElement test = driver.findElement(By.xpath("Create a new account"));
	if(TextEqual(test, ""))
	{
		
	}
}
}
