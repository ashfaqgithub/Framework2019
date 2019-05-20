package prec;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPrec {

	@Test (groups = { "smoke" })
	public void myTest(){
		System.out.println(" TC1: My First test");
		System.out.println(" TC1: selenium webdriver and java code");
	}
	@Test 
	public void my2Test(){
		System.out.println(" TC2: My 2nd test");
		System.out.println(" TC2: Some selenium webdriver and java code");
	
	}
	
	@BeforeSuite
	public void b4suite(){
		System.out.println("*** TEST SUITE STARTED ");
		// DB Connection
		// suite start time
	}
	
	@BeforeTest
	public void beforeTest (){
		System.out.println("BeforeTest - only happen once before all test start");
		//
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod: b4 each test start");
		
	}

	@AfterTest
	public void afterTest (){
		System.out.println("AfterTest - happen only once when all test r complete");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod : after each test");
		System.out.println("");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		// close db
		// suite end time

	}
}
