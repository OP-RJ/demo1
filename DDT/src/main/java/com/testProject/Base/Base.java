package com.testProject.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.testPractice.Actiondriver.Act;

public class Base {
	public static WebDriver driver;
	Properties prop = new Properties();

	@BeforeTest
	public void loadConfig() {
		try {
			FileInputStream F = new FileInputStream(
					"C:\\Users\\ROHAN\\Desktop\\old java workspace\\DDT\\Configuration\\config.properties");
			prop.load(F);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void launchBrowser() {

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHAN\\Downloads\\Programs\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		} else if (BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ROHAN\\Downloads\\Programs\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			Act.implicitWait(driver, 10);
		}

	}

}
