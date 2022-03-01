package Trash;

import org.testng.annotations.Test;

public class NewTest4 {
  @Test
  public void testcase1() {
	  long id = Thread.currentThread().getId();
	  System.out.println("test case 1 is successfull - Thread id is: " + id);
  }
  @Test
  public void testcase2() {
	  long id = Thread.currentThread().getId();
	  System.out.println("test case 2 is successfull - Thread id is: " + id);
  }
  @Test
  public void testcase3() {
	  long id = Thread.currentThread().getId();
	  System.out.println("test case 3 is successfull - Thread id is: " + id);
  }
  
}
