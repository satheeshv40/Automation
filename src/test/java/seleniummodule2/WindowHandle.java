package seleniummodule2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/2.02browserPopUp.html");
		String mainwindow = driver.getWindowHandle();
		System.out.println("main Window --> " + mainwindow);
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String> iterator = winhandles.iterator();
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			System.out.println("child window --> "+ChildWindow);
			if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.close();
			}
		}

	}

}
