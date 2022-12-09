package com.testPractice.Actiondriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testProject.Base.Base;

public class Act extends Base{

		public static void scrollByVisibilityOfElement(WebDriver driver,WebElement WL) {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].scrollIntoView(true)", WL);
				}
		
		public static void clickOnElement(WebDriver driver, WebElement WL) {
			Actions A=new Actions(driver);
			A.moveToElement(WL).click().build().perform();
				}
		
		public static void takeScreenshot(WebDriver driver, String S) throws IOException {
			String DateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
			File souece=takesScreenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\ROHAN\\Desktop\\ss" + S + "_" + DateName+".jpg");
			FileHandler.copy(souece, destination);		
		}
		public static boolean elementIsDisplayed(WebDriver driver, WebElement WL) {
			boolean b=WL.isDisplayed();
			if (b=true) {
				System.out.println(WL.getText() + "is displayed");
				}else {
					System.out.println(WL.getText() + "is not displayed");
				}
			return b;		
		}
		public static void sendKeys(WebElement WL, String S) {
			if (WL.isDisplayed()==true) {
				WL.click();
				WL.clear();
				WL.sendKeys(S);
			}	else {
				System.out.println(WL + "is not displayed");
						}
		}
		public static void implicitWait(WebDriver driver, int timeOut) {
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		}		
		public static void explicitWait(WebDriver driver, WebElement WL, int timeOut ) {
			WebDriverWait wait = new WebDriverWait(driver,timeOut);
			wait.until(ExpectedConditions.visibilityOf(WL));
		}
		public static void closeBrowser( ) {
			driver.quit();
		}
}
