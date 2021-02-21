package pom_ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginpage_locators {
	
	
	    WebDriver driver;
		
		By username = By.id("username");
		By passwd = By.name("pwd");
		By loginbutton = By.xpath("//*[@id=\"loginButton\"]/div");
		By forget_pass = By.xpath("//*[@id=\"keepLoggedInLabel\"]");
		
		
	
	
	public loginpage_locators(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void initial(String uid, String passid)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(passwd).sendKeys(passid);
		driver.findElement(loginbutton).click();
		
		String verify = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		System.out.println(verify);
		Assert.assertTrue(verify.contains("Time-Track"));
		
		
		
	}
	
	

}
