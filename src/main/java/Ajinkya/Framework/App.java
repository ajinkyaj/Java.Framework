package Ajinkya.Framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    void GoogleOpen()
    {
    	WebDriver driver = new FirefoxDriver();
    	driver.get("https:\\www.google.com");
    	driver.getTitle();
    	driver.close();
    }
}
