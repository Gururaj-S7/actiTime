package pom_ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class loginpage_locators2 {
	
	
	    WebDriver driver;
		
	    @FindBy(id="username") 
	    @CacheLookup
	    WebElement username;
	    
	    @FindBy(how=How.XPATH , using = "//input[@name='pwd']") 
	    @CacheLookup
	    WebElement passwd;
	    
	    @FindBy(how=How.CSS, using = "#loginButton > div") 
	    @CacheLookup
	    WebElement loginbutton;
	    
	    @FindBy(css = "#keepLoggedInLabel") 
	    WebElement keepme_logged;
	    
	    
//	    @FindBy(xpath="//input[@name='pwd']") WebElement passwd;
//	    @FindBy(css = "#loginButton > div") WebElement loginbutton;

	    
		
	
	
	public loginpage_locators2(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void initial(String uid, String passid)
	{
		username.sendKeys(uid);
		passwd.sendKeys(passid);
	    loginbutton.click();
		
		String verify = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		System.out.println(verify);
		Assert.assertTrue(verify.contains("Time-Track"));
		
		
		
	}
	
	

}
