package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(groups= {"Regression"})
  public void f() {
  System.out.println("one");
  }
  
  @Test(groups= {"regression","test"})
  public void f1() {
	  System.out.println("two");
	  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass(groups= {"regression"})
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
 System.out.println("After test");
  }

  @BeforeSuite
  public void beforeSuite() {
  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("After suite");
  }

}
