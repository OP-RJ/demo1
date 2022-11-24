package com.testAutomation.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testAutomation.Utility.Utility;

public class Base1 {
	public  WebDriver driver;
	@BeforeMethod
	public  void browserLaunch() throws IOException {
		if (Utility.fetchDataFromConfigFile("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ROHAN\\Downloads\\Programs\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(Utility.fetchDataFromConfigFile("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ROHAN\\Downloads\\Programs\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
		}
		
		}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
