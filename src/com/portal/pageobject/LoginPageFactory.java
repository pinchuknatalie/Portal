package com.portal.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	
	
	
	// Priority Test Elements
		@FindBy(id = "username")
		WebElement usernameField;

		@FindBy(id = "password")
		WebElement passwordField;

		@FindBy(className = "btn btn-danger")
		WebElement login;



		public Object loginToPortal;

		
		
		// LoginPageFactory Constructor
		
		public LoginPageFactory(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		/********** Required Login Methods **********/

		public void inputUsername(String username) {
			usernameField.clear();
			usernameField.click();
			usernameField.sendKeys(username);

		}

		public void inputPassword(String password) {
			passwordField.clear();
			passwordField.click();
			passwordField.sendKeys(password);
		}

		public void loginButtonClick() {
			login.click();
		}

		// Main Login API - Includes Above Methods

		public void loginToPortal(String username, String password) {
			inputUsername(username);
			inputPassword(password);
			loginButtonClick();
		}

		
			
		}

		/********** END - Required Login Methods - END **********/


	


