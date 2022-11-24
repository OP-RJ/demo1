package com.testAutomation.POM_Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.testAutomation.Base.Base1;
import com.testAutomation.Utility.Utility;

public class LogIn extends Base1 {
	public WebDriver driver;
	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public  void enterUserName() throws IOException {
		WebElement UN=driver.findElement(By.xpath(Utility.fetchLocators("logIn_id")));
		UN.click();
		UN.sendKeys(Utility.fetchCredentials("UN"));
	}
	
	public void enterPassword() throws IOException {
		WebElement PW=driver.findElement(By.xpath(Utility.fetchLocators("logIn_pw")));
		PW.click();
		PW.sendKeys(Utility.fetchCredentials("PW"));
	}
	
	public void clickOnSubmitButton() throws IOException {
		WebElement SB=driver.findElement(By.xpath(Utility.fetchLocators("submit_button")));
		SB.click();
	}
}
