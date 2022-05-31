package seleniummodule2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/2.12browserMultiPopUp.html");
		String mainwindow =driver.getWindowHandle();
		System.out.println("main window id --> "+mainwindow);
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();
		Set<String> windows =driver.getWindowHandles();
		List<String> tabs = new ArrayList<String>(windows);
		System.out.println("No of windows --> "+ tabs.size());
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(3));
		System.out.println(driver.getTitle());
		
		//String driver.switchTo().window(tabs.get(0)).getTitle();

		driver.close();
		
		
		

	}

}
