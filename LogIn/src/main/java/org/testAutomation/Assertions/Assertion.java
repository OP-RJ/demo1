package org.testAutomation.Assertions;

import org.openqa.selenium.WebDriver;

public class Assertion {
	public static WebDriver driver;
	
public static boolean validateURL() {
	String ActualURL=driver.getCurrentUrl();
	String ExpectedURL="https://practicetestautomation.com/practice-test-login/";
	boolean b= ActualURL.equalsIgnoreCase(ExpectedURL);
	if (b=false) {
		System.out.println("WRONG URL");
	}else {
		System.out.println("CORRECT URL");
	}
	return b;
	}

public static boolean validatePageTitle() {
	String ActTitle=driver.getTitle();
	String ExpectedTitle="DUMMY PAGE TITLE";
	boolean b1=ActTitle.equalsIgnoreCase(ExpectedTitle);
	if (b1=true) {
		System.out.println("WRONG title");
	} else {
		System.out.println("Correct title");
	}
	return b1;
	
}
}
