package com.testPractice.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testPractice.Actiondriver.Act;
import com.testProject.Base.Base;

public class LogIn extends Base{
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;

	@FindBy(xpath="//input[@id='login-button']")
	private WebElement LogInButton;
	
	@FindBy(xpath="//div[@class='login_logo']")
	private WebElement logo;
	
	public LogIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void validateLogo() {
		Act.elementIsDisplayed(driver, logo);
		
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void enterUserName() {
		Act.clickOnElement(driver, UserName);
		Act.sendKeys(UserName, "standard_user");
	}
	
	public void enterPassword() {
		Act.clickOnElement(driver, password);
		Act.sendKeys(password, "secret_sauce");
	}
	public HomePage clickLogIn() {
		Act.clickOnElement(driver, LogInButton);
		return new HomePage();
	}
	public void closeTheBrowser( ) {
		Act.closeBrowser();
	}
	
}
