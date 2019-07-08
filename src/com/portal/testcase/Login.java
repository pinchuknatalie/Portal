package com.portal.testcase;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import com.portal.pageobject.LoginPageFactory;



public class Login {

	
	private WebDriver driver;
	private String BaseUrl;
	LoginPageFactory loginPage;
	
	@Beforetest
	public void beforeTest() {
	
		driver = new ChromeDriver();
		BaseUrl = "https://ar.absoluteresults.com";
		
		// LoginPage Factory Instance
		loginPage = new LoginPageFactory(driver);
		
		// Maximize Browser Window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(BaseUrl);
				
	}
	
	@Test 
	
	public void Test() {
		loginPage.loginToPortal("npinchuk","Np&Ar29#");
	}
	
    @AfterTest
    
    public void AfterTest() {
	   
    	driver.close();
   }
}

	
	
	
  
		
	


