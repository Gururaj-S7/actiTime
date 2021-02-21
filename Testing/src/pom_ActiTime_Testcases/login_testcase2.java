package pom_ActiTime_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import direct_input.for_browser;

import pom_ActiTime.loginpage_locators2;

public class login_testcase2 {

	@Test
	public void loginpage()
	{
	
		WebDriver driver = for_browser.browser("firefox");
		
		loginpage_locators2 login = PageFactory.initElements(driver, loginpage_locators2.class);
		
		login.initial("admin", "manager");
		
		driver.quit();
		
	}
	
	
}
