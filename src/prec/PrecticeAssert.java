package prec;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrecticeAssert {

	@Test
	public void tryCatchTest(){
		String expValue = "google"; // Requirement
		String actValue = "googleee"; // results, webApp
		Assert.assertEquals(actValue, expValue);

	}
}
