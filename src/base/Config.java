package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utils.WebDriverFunctions;

public class Config extends WebDriverFunctions{

	@Parameters("browser")
	@BeforeMethod
	public void beforeEachTest(String browser){
		if (browser.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			// init the firefox driver
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("ch")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			// init the chrome driver
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("safari")){
			System.setProperty("webdriver.safair.driver",System.getProperty("user.dir")+"\\drivers\\safari.exe");
			// init the chrome driver
			driver = new ChromeDriver();
		}
		
		driver.get("http://www.facebook.com");
		// maximize the window 
		driver.manage().window().maximize();
		// wait 30 second to wait all elements to load in the page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterEachTest(){
		driver.close();
	}

	@AfterSuite
	public void suiteComplete(){
		driver.quit();
		//currentTime();
	}
}
