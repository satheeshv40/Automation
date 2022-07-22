package extendreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.class)
public class TestNG {
	
//WebDriver driver = new FirefoxDriver();
	
	@Test  //Success Test
	public void CloseBrowser() {
	System.out.println("test");
	}
	
	@Test //Failed Test
	public void OpenBrowser() {
	        
	       
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = "Free QA Automation Tools For Everyone1";
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
  }
	private int i = 1;

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}


}
