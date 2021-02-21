package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base_testcase 
{

	public String url = "http://localhost/login.do";
	public String username = "admin";
	public String password = "manager";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterClass
	public void stop()
	{
		driver.quit();
		
	}
	
}
