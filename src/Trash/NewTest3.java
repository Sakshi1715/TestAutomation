package Trash;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest3 {
	/*
	 * @Test (groups = {"sanity" , "regresion"}, priority = 1) public void login() {
	 * System.out.println("login successfull"); }
	 */

	 @BeforeGroups (groups = {"sanity" , "regresion"}) 
	 public void login() {
	  System.out.println("login successfull"); }
	 
  @Test  (groups = {"sanity"}, priority = 3)
  public void fundtransfer() {
	  System.out.println("fund transfer successfull");
  }
  @Test  (groups = {"sanity"}, priority = 2)
  public void search() {
	  System.out.println("search successfull");
  }
  @Test  (groups = {"regresion"}, priority = 2)
  public void advancedsearch() {
	  System.out.println("advancedsearch successfull");
  }
  @Test  (groups = {"regresion"}, priority = 3)
  public void prepaidrecharge() {
	  System.out.println("prepaidrecharge successfull");
  }
  @Test  (groups = {"regresion"}, priority = 4)
  public void billpayments() {
	  System.out.println("billpayments successfull");
  }
	/*
	 * @Test (groups = {"sanity" , "regresion"}, priority = 10) public void logout()
	 * { System.out.println("logout successfull");
	 * 
	 * }
	 */
  @AfterGroups  (groups = {"sanity" , "regresion"})
  public void logout() {
	  System.out.println("logout successfull");
  
}
}

