package Ajinkya.Framework;
import org.openqa.selenium.WebElement;

public class TextAssertion {
	
	public boolean TextEqual(WebElement ExpectedText, String ActualText)
	{
		boolean result = ExpectedText.getText().equals(ActualText);
		System.out.println(ExpectedText.getText());
		System.out.println(ActualText);
		return result;
	}

}
