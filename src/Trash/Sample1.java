package Trash;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Sample1 {
	@Test 
	public void login() {
		
		System.out.println("login successfully");
	}
	@Test (dependsOnMethods = {"login"})
	public void search() {
		Assert.assertEquals("xyz", "xyz");
		//System.out.println("search successfull");
	}
	@Test (dependsOnMethods = {"search"})
	public void advancedsearch() {
		Assert.assertEquals("abcd", "efgh");
		//System.out.println("advancedsearch successfull");
	}
	@Test (dependsOnMethods = {"advancedsearch"} , alwaysRun = true)
	public void logout() {
		
		System.out.println("logout successfully");
	}

}
