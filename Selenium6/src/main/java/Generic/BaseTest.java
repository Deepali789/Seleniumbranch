package Generic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends UtilityMethod {
	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("connect to server",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("connect to database",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("connect to browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("disconnect to browser",true);	
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("disconnect to database",true);
	}
	@AfterSuite
	public void afterSuit() {
		Reporter.log("disconnect to server",true);
	}

}
