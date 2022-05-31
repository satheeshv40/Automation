package seleniummodule2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/2.03frame.html");
		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		System.out.println(ele.size());
		

		for (int i=0;i<ele.size();i++) {
			switchToFrame(i,driver);	
		}
	}

	public static void switchToFrame(int i, WebDriver driver) {
		try {
			driver.switchTo().frame(i);
			if(driver.findElement(By.xpath("// *[text()='Click Me']")).isEnabled()) {
				driver.findElement(By.xpath("// *[text()='Click Me']")).click();
				System.out.println("clicked");
			}
		}catch(NoSuchFrameException e) {
			System.out.println("The Excepetion is "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Unable to navigate to frame with id " 
					+ e.getStackTrace());
		}
	}
}
