package com.pageutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static Cofigdataprovider config;
	public static Exceldataprovider excel;
	
	@BeforeSuite
	public void configsetup() throws IOException {
		config=new Cofigdataprovider();
		excel=new Exceldataprovider();
	}
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.get(config.getStageurl());
		driver.manage().window().maximize();
	}
	@AfterMethod()
	public void teardown() {
		driver.close();
	}
	
}
