package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.UtilityMethod;

public class BasePage extends UtilityMethod {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
