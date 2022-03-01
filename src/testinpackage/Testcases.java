package testinpackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CommonUtility.Actions;
import DOMElements.PageElements;


public class Testcases extends TestAbstract {

	@Test(dataProvider="DataContainer", dataProviderClass=DataMine.class)
	public void addvendor(String UserName, String Password) throws InterruptedException {
		
		Actions action = new Actions();
		PageElements element = new PageElements();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		action.EnterValue(driver, element.userid(), UserName);
		action.EnterValue(driver, element.password(), Password);
		action.clickElement(driver, element.loginbutton());

		System.out.println(UserName);
		System.out.println(Password);
		
		
	

	}
}