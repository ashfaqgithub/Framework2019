package prec;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Utils.Xls_Reader;
import base.Config;
import locators.facebookLocators;

public class ReadFromXl extends Config{

	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"//testCase.xlsx");
	facebookLocators fl = new facebookLocators();
	
	@Test
	public void testReadFromXL(){
		//String value = xl.getCellData(sheetName, colName, rowNum)
		String value = xl.getCellData("facebook", "TestData", 2);
		System.out.println("value" + value);
		driver.findElement(By.xpath(fl.email)).sendKeys(value);
		driver.findElement(By.xpath(fl.fnLoc)).sendKeys(xl.getCellData("facebook", "TestData", 3));
	}
	
	@Test
	public void testWriteInXl(){
		// Copy the text from fb website and enter in excel file
		String getTextValue = driver.findElement(By.xpath(fl.signUpText)).getText();
		System.out.println("Text from fb website : "+ getTextValue);
		xl.setCellData("facebook", "TestData", 4, getTextValue);
	} 
	
	
}
