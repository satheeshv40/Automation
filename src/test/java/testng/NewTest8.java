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

public class NewTest8 {
	
	@Test(priority=-1)
  public void afirst1( ) {
  System.out.println("one");
  
  }
  
  @Test(priority=-2)
  public void bsecond() {
	  System.out.println("two");
	  
	  }
  
  @Test(priority=0)
  public void csecond() {
	  System.out.println("three");
	  
	  }
  @Test
  public void asecond() {
	  System.out.println("four");
	  
	  }
  
 
}
