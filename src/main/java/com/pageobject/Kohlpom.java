package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Kohlpom {

	@FindBy(id="kiosk_loginEmail")private WebElement Emailaddress;
	@FindBy(id="kiosk_loginPassword")private WebElement Password;
	@FindBy(id="Profilelogin")private WebElement Signin;
	public WebElement getEmailaddress() {
		return Emailaddress;
	}
	public void setEmailaddress(WebElement emailaddress) {
		Emailaddress = emailaddress;
	}
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}
	public WebElement getSignin() {
		return Signin;
	}
	public void setSignin(WebElement signin) {
		Signin = signin;
	}
	
	
}
