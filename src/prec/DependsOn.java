package prec;

import org.testng.annotations.Test;

public class DependsOn {
	// relay on
	
@Test
public void openBrowser(){
	System.out.println("This will excute first");
}

@Test (dependsOnMethods = { "openBrowser" })
public void SignIn() {
	// driver.finElement ()
	System.out.println("This will execute second");
}

@Test (dependsOnMethods = { "SignIn" })
public void LogOut() {
	System.out.println("This will execute third (Log Out)");
}

}
