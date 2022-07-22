package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import static org.testng.Assert.assertEquals;
import  org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 {
	
  @Test
  public void afirst() {
  System.out.println("one");
  
  }
  
  @Test(dependsOnMethods= {"bthree"})
  public void ctwo() {
  System.out.println("two");
  }
  
  @Test(enabled=true)
  public void bthree() {
  System.out.println("three");
  }
 
}
