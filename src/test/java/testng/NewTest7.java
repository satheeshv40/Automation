package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import  org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest7 {
	
	@Test
  public void afirst1( ) {
  System.out.println("one");
  
  }
  
  @Test(dependsOnMethods= {"afirst1"},enabled=true,alwaysRun=true)
  public void asecond() {
	  System.out.println("two");
	  
	  }
  
  
 
}
