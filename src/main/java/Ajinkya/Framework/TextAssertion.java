package Ajinkya.Framework;

import org.openqa.selenium.WebElement;

public abstract class TextAssertion {
	
	public boolean TextEqual(WebElement ExpectedText, String ActualText)
	{
		boolean result = ExpectedText.getText().equals(ActualText);
		return result;
	}

}
