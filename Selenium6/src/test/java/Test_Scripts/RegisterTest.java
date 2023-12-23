package Test_Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import Pom_Script.BasePage;
import Pom_Script.RegisterPage;

public class RegisterTest extends BaseTest{

//	public RegisterTest(WebDriver driver) {
	//	super();
		// TODO Auto-generated constructor stub
	//}
	@DataProvider(name="registerdata")
	public static Object[][] data() throws IOException{
		return ReadExcel.getMultipleData("sheet1");
		
	}
	@Test(dataProvider="registerdata")
	public void testCase(String fn,String ls,String em,String pass,String conpass) {
		RegisterPage r = new RegisterPage(driver); 
		r.getRegisterlink().click();
		r.getFirstname().sendKeys(fn);
		r.getLastname().sendKeys(ls);
		r.getEmailid().sendKeys(em);
		r.getPassword().sendKeys(pass);
		r.getConfirmpassword().sendKeys(conpass);
		r.getRegisterbutton().click();
	}
	
}
