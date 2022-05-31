package seleniummodule2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/2.05resize.html");
		WebElement drag = driver.findElement(By.name("resizeArea"));
		System.out.println(drag.getLocation().getX());
		
		System.out.println(drag.getLocation().getY());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 591, 450);
		
		

	}

}
