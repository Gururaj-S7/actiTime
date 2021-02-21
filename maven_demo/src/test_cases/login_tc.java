package test_cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import page_object.login_po;

public class login_tc extends base_testcase 
{

	@Test
	public void logintest()
	{
		
		driver.get(url);
		
		login_po log1 = new login_po(driver);
		log1.login_cred(username, password);
		
		String str = driver.findElement(By.xpath("//td[@class='pagetitle']")).getText();
		
		Assert.assertTrue(str.contains("Time-Track"));
		
		
		
	}
	
}
