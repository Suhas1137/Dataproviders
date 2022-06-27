package com.Utility;

import org.openqa.selenium.WebElement;

public class Library {

	public static void Custom_senkeys(WebElement element,String value) {
		if(element.isDisplayed() && element.isEnabled()) {
			element.sendKeys(value);
		}else {
			System.out.println("Unable to send values");
		}
	}
	public static void Custom_Click(WebElement element) {
		if(element.isEnabled()) {
			element.click();
		}else {
			System.out.println("unable to click");
		}
	}
}
