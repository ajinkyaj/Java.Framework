package Ajinkya.Framework;
import java.io.IOException;

import org.junit.Test;


public class GoogleTest extends BrowserOperations{
	
	@Test
	public void OpenGoogle() throws IOException
	{
		driver = initializeDefaultDriver();
		driver.get("https:\\www.google.com");
		driver.close();
	}
}
