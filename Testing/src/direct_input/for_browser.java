package direct_input;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class for_browser {

	static WebDriver driver;
	
	public static WebDriver browser(String Browser_name)
	{
		if(Browser_name.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(Browser_name.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		
		return driver;
	}
	
	
}
