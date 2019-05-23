package prec;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityPrec {

	
	@Test (priority=2)
	public void changePass(){
		System.out.println ("Changing password");
	}
	
	@Test (priority=3)
	public void logOutTest(){
		System.out.println ("Log out first");
	}
	
	@Test (priority=1)
	public void logInTest(){
		System.out.println ("Login first");
	}
	
	@Test (priority=4)
	public void goinToSkipTest(){
		System.out.println ("Skipped this test");
		throw new SkipException ("SF-1: requirement changed so skipping it");
	}
	
	@Test (enabled=false,priority=5)
	public void dontRunThisTest(){
		System.out.println ("do not run this test");
	}
	
}
