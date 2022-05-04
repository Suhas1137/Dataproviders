package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
public static ConfigDataProvider config;
public static ExcelDataProvider excel;

@BeforeSuite
public void configsetup() throws Exception {
	config=new ConfigDataProvider();
	excel=new ExcelDataProvider();
}
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void Setup(String BrowserName) throws Exception {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(config.getStageUrl());
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
