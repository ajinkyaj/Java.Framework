package Ajinkya.Framework;
<<<<<<< HEAD
import org.junit.Test;
=======


>>>>>>> develop
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
<<<<<<< HEAD
=======
import org.testng.annotations.Test;
>>>>>>> develop

public class TestModules extends TextAssertion{
@Test
public void test()
{
	WebDriver driver = new FirefoxDriver();
<<<<<<< HEAD
	driver.get("https:\\www.facebook.com");
=======
	driver.get("https:\\www.google.co.in");
>>>>>>> develop
	WebElement test = driver.findElement(By.xpath("Create a new account"));
	if(TextEqual(test, ""))
	{
		
	}
}
<<<<<<< HEAD
=======

>>>>>>> develop
}
