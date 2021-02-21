package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_test {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\QA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
//		Thread.sleep(5000);
		
		driver.getTitle();
		driver.getCurrentUrl();
			
		driver.quit();
	}

}
