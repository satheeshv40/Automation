package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import  org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest6 {
	
	@Test(dataProvider="data")
  public void afirst1(int a, int b, int c ) {
  System.out.println("one");
  c=a+b;
  System.out.println(c);
  
  }
  
  @DataProvider
  public Object[][] data() {
	  return new Object[][]{{2, 3 , 5}, {5, 7, 9}} ;
  }
 
}
