package Ajinkya.Framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class ScrollBrowser {
	WebDriver driver;
	public JavascriptExecutor jse = (JavascriptExecutor)driver;
	public void scrollDown()
	{
		jse.executeScript("window.scrollBy(0,250)", "");
	}
	public void scrollUp()
	{
		jse.executeScript("window.scrollBy(0,-250)", "");
	}
	public void scrollToElement(WebElement element)
	{
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
