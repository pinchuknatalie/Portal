package com.portal.pageobject;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class NewTest {
	 
		
	    public String baseUrl = "https://ar.absoluteresults.com";
	    String driverPath = "C:\\Users\\npinchuk\\Automation Tools\\Chrome\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\npinchuk\\Automation Tools\\Chrome\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Absolute Results";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	  }
	}


