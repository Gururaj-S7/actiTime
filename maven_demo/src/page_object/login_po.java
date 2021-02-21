package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_po {
	
	
    WebDriver driver;
	public login_po(WebDriver ldriver)
	{
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
		
		
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "pwd")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"loginButton\"]/div")
	@CacheLookup
	WebElement button;
	

	public void login_cred(String uid , String passid)
	{
		username.sendKeys(uid);
		password.sendKeys(passid);
		button.click();
		
		
		
	}
	
	

}
