package CommonUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Actions {

	public  Actions clickElement(WebDriver driver, String element) throws InterruptedException {

		CommonFunctions cmn = new CommonFunctions();
		boolean isElementPresent=cmn.waitPeriod(driver,element);	//waiting for an element for 30 seconds if its present

		try {
			if (isElementPresent) {

				driver.findElement(By.xpath(element)).click(); //Click on the element

			} else {

				System.out.println("Element not present");

			}
		} catch (Exception e) {
							System.out.println("Something wired happened");
			

		}

		return this;

	}
	
	public  Actions EnterValue(WebDriver driver, String element, String Value) throws InterruptedException {

		CommonFunctions cmn = new CommonFunctions();
		boolean isElementPresent=cmn.waitPeriod(driver,element);	//waiting for an element for 30 seconds if its present

		try {
			if (isElementPresent) {

				driver.findElement(By.xpath(element)).sendKeys(Value); //enter the value
				System.out.println("Value: "+Value+" successfully enterd");

			} else {

				System.out.println("Element not present");

			}
		} catch (Exception e) {
							System.out.println("Something wired happened");
			

		}

		return this;

	}	

}
