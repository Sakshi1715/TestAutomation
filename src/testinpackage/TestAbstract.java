package testinpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import drivers.Managedriver;

public class TestAbstract {
	
	public WebDriver driver;

	@BeforeSuite
	public void beforesuitsMethods() {
		
		System.out.println("#############3 Hay I am before Test##############");
		
		  Managedriver drivermanager = new Managedriver();
		  driver=drivermanager.getDriverType();
		 
		
	}
	
}
