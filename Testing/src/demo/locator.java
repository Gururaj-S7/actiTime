package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	
	public static void main(String[] args) {
		
          System.setProperty("webdriver.chrome.driver", "F:\\QA\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
          driver.get("https://facebook.com");
		  
		  driver.findElement(By.id("email")).sendKeys("gururajshettigar92@gmail.com");
		  driver.findElement(By.id("pass")).sendKeys("159372865");
		  driver.findElement(By.name("login")).click();
		
//		  driver.get("https://google.com");
//		  WebElement c = driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
//		  c.click();
//		  c.sendKeys("xpath");
//		  driver.findElement(By.className("gNO89b")).click();
				  
		  String a = driver.getCurrentUrl();
		  System.out.println(a);
		  String b = driver.getTitle();
		  System.out.println(b);
		  
		   
		  
		  		
		
	}
	

}
