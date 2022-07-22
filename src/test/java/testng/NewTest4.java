package testng;

import org.testng.annotations.Test;
import org.testng.Assert;

public class NewTest4 {
	
  @Test
  public void afirst() {
  System.out.println("one");
  Assert.assertEquals("test", "test1");
  //Assert.as
  }
  
  @Test(dependsOnMethods= {"afirst"})
  public void bfirst() {
  System.out.println("1one");
  }
  
  
 
}
