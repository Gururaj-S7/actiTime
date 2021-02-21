package pom_ActiTime_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_ActiTime.loginpage_locators;

public class login_testcase {

	@Test
	public void loginpage()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		loginpage_locators login = new loginpage_locators(driver);
		
		login.initial("admin", "manager");
		
		
		driver.quit();
		
		
	}
	
	
}
