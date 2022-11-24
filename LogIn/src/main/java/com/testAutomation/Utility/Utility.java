package com.testAutomation.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public static String fetchDataFromConfigFile(String key) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\ROHAN\\Desktop\\old java workspace\\LogIn\\Configuration\\config.properties");
		Properties pro = new Properties();
		pro.load(file);
		String str=pro.getProperty(key);
		return str;		
	}
	
	public static String fetchLocators(String key) throws IOException {
		FileInputStream F=new FileInputStream("C:\\Users\\ROHAN\\Desktop\\old java workspace\\LogIn\\Configuration\\locators.properties");
		Properties P=new Properties();
		P.load(F);
		String S=P.getProperty(key);
		return S;
	}
	
	public static String fetchCredentials(String key) throws IOException {
		FileInputStream F1=new FileInputStream("C:\\Users\\ROHAN\\Desktop\\old java workspace\\LogIn\\Configuration\\locators.properties");
		Properties P1=new Properties();
		P1.load(F1);
		String S1=P1.getProperty(key);
		return S1;
	}
	
	public static void takeScreenShot(String str) {
		System.out.println("SS taken");
	}
	public static void fetchDataFromExcelSheet(int row, int cell) {
		System.out.println("Excel");
	}
}
