package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.Kohlpom;
import com.pageutility.Baseclass;
import com.pageutility.Library;

public class verifyfbTc001 extends Baseclass{

	@Test
	public void verifykohl() {
		Kohlpom kohl=PageFactory.initElements(driver, Kohlpom.class);
		
		Library.custom_sendkeys(kohl.getEmailaddress(), excel.getStringData("Sheet1", 0, 0));
		Library.custom_sendkeys(kohl.getPassword(), excel.getStringData("Sheet1", 2, 2));
		Library.custom_click(kohl.getSignin());
	}
}
