package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Orangepom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class verifyorange extends BaseClass{

	@Test
	public void verifyorange_tc001() {
		Orangepom orange=PageFactory.initElements(driver, Orangepom.class);
		Library.Custom_senkeys(orange.getUsername(),excel.getStringData("Sheet1", 0, 0));
		Library.Custom_senkeys(orange.getPassword(),excel.getStringData("Sheet1", 0, 1));
		Library.Custom_Click(orange.getLoginbtn());
	}
}
