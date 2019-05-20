package prec;

import org.testng.annotations.Test;

public class Grouping {

	@Test (groups = { "smoke" })
	public void talentTEK1() {
		// change profile
		System.out.println("talentTEK - TEST CASE 1");
	}
	
	@Test (groups = { "sanity" })
	public void talentTEK2() {
		// invite friends
		System.out.println("talentTEK - test case 2");
	}
	
	@Test (groups = { "regression" })
	public void Consulting2() {
		// new sign up
		System.out.println("Batch Consulting - Test Consulting 2");
	}

	@Test (groups = { "regression", "smoke", "sanity" })
	public void talentTEK_Consulting() {
		// facebook login test case
		System.out.println("Run all test");
	}

}
