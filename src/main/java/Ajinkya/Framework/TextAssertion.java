package Ajinkya.Framework;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;

public class TextAssertion {
=======

import org.openqa.selenium.WebElement;

>>>>>>> develop
	
	public boolean TextEqual(WebElement ExpectedText, String ActualText)
	{
		boolean result = ExpectedText.getText().equals(ActualText);
<<<<<<< HEAD
		System.out.println(ExpectedText.getText());
		System.out.println(ActualText);
		return result;
	}

=======
		return result;
	}
	public boolean TextContains(WebElement ExpectedText, String ActualText)
	{
		boolean result = ExpectedText.getText().contains(ActualText);
		return result;
	}
>>>>>>> develop
}
