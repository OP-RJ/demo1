package com.testPractice.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testPractice.POM.LogIn;
import com.testProject.Base.Base;

public class LogInPageTest extends Base {
	
	@BeforeTest
	public void startBrowser() throws InterruptedException {
			launchBrowser();
			Thread.sleep(3000);
		}
		
		LogIn obj=new LogIn(driver);
		 
		@Test
		public void logIn() {
			obj.enterUserName();
			obj.enterPassword();
			obj.clickLogIn();
		}
		@AfterTest
		public void quitBrowser() {
			obj.closeTheBrowser();
		}
}
