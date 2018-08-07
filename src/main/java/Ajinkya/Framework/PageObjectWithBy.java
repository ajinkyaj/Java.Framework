package Ajinkya.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectWithBy {

		WebDriver driver;
		By Element_to_be_search = By.id("element_information");
		
		public PageObjectWithBy(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public WebElement Element_to_be_search_function()
		{
			return driver.findElement(Element_to_be_search);
		}
}
