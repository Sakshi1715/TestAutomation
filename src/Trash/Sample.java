package Trash;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Sample {
	@Test  
	public void verifyTitle() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("https://gmail.com");
	//String pagetitle= driver.getTitle();
	//Assert.assertEquals(pagetitle, "gmail");
	
	}

	/*
	 * @Test (priority = 3) public void testA() { Assert.assertEquals("gmail",
	 * "gmail"); }
	 * 
	 * @Test (priority = 2, enabled= false) //enabled false means dont want to
	 * executed. public void testC() { Assert.assertEquals("google", "google"); }
	 * 
	 * @Test (priority = 1) public void testB() { Assert.assertEquals("Yahoo",
	 * "Yahoo"); }
	 */
	@Test (priority = 1)
	public void login() {
		//Assert.assertEquals("gmail", "gmail");
		System.out.println("login successfully");
	}
	@Test (priority = 2)
	public void search() {
		//Assert.assertEquals("google", "google");
		System.out.println("search successfull");
	}
	@Test (priority = 3, enabled= false)
	public void advancedsearch() {
		//Assert.assertEquals("Yahoo", "Yahoo");
		System.out.println("advancedsearch successfull");
	}
	@Test (priority = 4)
	public void logout() {
		//Assert.assertEquals("gmail", "gmail");
		System.out.println("logout successfully");
	}
}
