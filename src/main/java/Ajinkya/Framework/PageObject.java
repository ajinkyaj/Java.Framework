package Ajinkya.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

		WebDriver driver;
		By password = By.id("pass");
		
		@FindBy(id="email")
		WebElement Username;
		
		public PageObject(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public WebElement Password()
		{
			return driver.findElement(password);
		}
		
		public WebElement Username()
		{
			return Username;
		}
}
