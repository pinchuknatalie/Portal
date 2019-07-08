package com.portal.pageobject;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;	

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		
			

		 {									
		        String baseUrl = "https://ar.absoluteresults.com";					
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\npinchuk\\Automation Tools\\Chrome\\chromedriver_win32\\chromedriver.exe");					
		       
		        //opening a browser
		        WebDriver driver = new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        
		        //loading a URL
		        driver.get(baseUrl);
		        
		        Thread.sleep(5000);
		        
		        driver.findElement(By.id("username")).sendKeys("npinchuk");
		        System.out.println("Typed npinchuk");
		        
		        Thread.sleep(5000);
		        
		        driver.findElement(By.id("password")).sendKeys("Np&Ar29#");
		        System.out.println("Typed Np&Ar29#");
		        
		        Thread.sleep(5000);
		        
		        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div/div/div[5]/div[2]/input")).click();
		        
		        //driver.findElement(By.xpath("/html/body/nav/div/div[1]/button")).click();
		    
		        WebElement element = driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[7]/a"));
		        
		        Select PrivateSales_dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[7]/a")));
		        
		        
		        PrivateSales_dropdown.selectByVisibleText("My Events");
		        
		        
		        //Select new Select(driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[3]/a"))).selectByVisibleText("CA Calendar");
		    
		        
		        
		        //driver.findElement(By.linkText("Appt Log V2")).click();					
		        //System.out.println("title of page is: " + driver.getTitle());							
		        
		        driver.close();
		        driver.quit();			
		    }		

		}		
	}


