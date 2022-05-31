package seleniummodule2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/2.08progressBar.html");
		driver.findElement(By.xpath("//*[@onclick='move()']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button2"))));
		driver.findElement(By.id("button2")).click();
		driver.switchTo().alert().accept();
		System.out.println("Success");
		driver.close();
	}

}
