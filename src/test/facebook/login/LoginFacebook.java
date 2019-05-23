package test.facebook.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.facebookLocators;
import values.fbValues;

public class LoginFacebook extends Config{

	facebookLocators 	fbl = new facebookLocators();
	fbValues			fbv = new fbValues();
	
	
	@Test (groups = { "smoke" })
	public void testFacebookSignup(){


		// Enter firstName
		driver.findElement(By.xpath(fbl.fnLoc)).sendKeys(fbv.fnVal);
		// Enter lastName
		driver.findElement(By.xpath(fbl.lnLoc)).sendKeys(fbv.lnVal);
	}



}
