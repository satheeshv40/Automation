package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import static org.testng.Assert.assertEquals;
import  org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest5 extends NewTest4{
	
  @Test(dependsOnMethods= {"afirst"}, enabled=false)
  @Parameters({"val1" ,"val2"})
  public void afirst1(int v1, int v2) {
  System.out.println("one");
  System.out.println(v1*v2);
  
  }
  
  @Test
  public void asecond(int v1, int v2) {
	  System.out.println("one");
	  System.out.println(v1*v2);
	  
	  }
  
  
 
}
