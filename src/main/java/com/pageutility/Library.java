package com.pageutility;

import org.openqa.selenium.WebElement;

public class Library {

	public static void custom_sendkeys(WebElement element,String value) {
		if(element.isEnabled() && element.isDisplayed()) {
			element.sendKeys(value);
		}else {
			System.out.println("unable to enter the value");
		}
	}
	public static void custom_click(WebElement element) {
		if(element.isEnabled()) {
			element.click();
		}else {
			System.out.println("unable to click");
		}
	}
}
