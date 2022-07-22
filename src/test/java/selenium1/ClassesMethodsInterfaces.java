package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassesMethodsInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/** List of interfaces
		 *  13 Interface are available in Selenium
		 *  1. SearchContext 
		 *  2. WebDriver
		 *  3. WebElement
		 *  4. TakesScreenshot
		 *  5. JavaScriptExector
		 *  6. Timeouts 
		 *  7. TargetLocator
		 *  8. Alert
		 *  9. Action
		 *  10. OutputType
		 *  11. Options
		 *  12. ExpecedtedContions
		 *  13. Navigations
		 *    
		 *  **/
		
	//	Webdriver Methods
		
		driver.get("");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.findElement(By.xpath(""));
		driver.findElements(By.xpath(""));
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.quit();
		driver.close();
		driver.manage();
		driver.navigate();
		driver.switchTo();
		
	// WebElement Methods
		
		WebElement ele = driver.findElement(By.xpath(""));
		
		ele.clear();
		ele.click();
		ele.getAttribute("");
		ele.getCssValue("");
		ele.isDisplayed();
		ele.isEnabled();
		ele.isSelected();
		ele.findElement(By.xpath(""));
		ele.findElements(By.xpath(""));
		ele.getLocation();
		ele.getRect();
		ele.getSize();
		//ele.getScreenshotAs("");
		ele.getText();
		ele.getTagName();
		ele.sendKeys("");
		
		
		/** 
		 * Javascripts methods
		 * 
		 * 1) execute script
		 * 2) execute anysccript
		 *
		 */
		
		
		
		
		
		
	}

}
