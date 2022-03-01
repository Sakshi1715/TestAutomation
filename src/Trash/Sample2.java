package Trash;
import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	public WebDriver driver;
	
@BeforeMethod
public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\Selenium\\Driver\\chromedriver.exe");
   driver = new ChromeDriver();
}
@Test (priority = 2)
public void verifypageTitle1() {
	driver.get("https://google.com");
	Assert.assertEquals("Google", driver.getTitle());
}
@Test (priority = 3)
public void verifypageTitle2() {
	//driver.navigate().to("https://www.gmail.com");
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail", driver.getTitle());
}
@AfterMethod
public void closebrowser() {

driver.close();
	
}
}
