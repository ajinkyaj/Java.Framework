package Ajinkya.Framework;

import org.openqa.selenium.WebElement;

public abstract class TextAssertion {
	
	public boolean TextEqual(WebElement ExpectedText, String ActualText)
	{
		boolean result = ExpectedText.getText().equals(ActualText);
		return result;
	}
	public boolean TextContains(WebElement ExpectedText, String ActualText)
	{
		boolean result = ExpectedText.getText().contains(ActualText);
		return result;
	}
}
