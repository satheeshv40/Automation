package seleniummodule1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/1.14pageTitle.html");
		driver.findElement(By.id("inputfield")).sendKeys(driver.getTitle());
		Thread.sleep(1000);
		driver.get("https://codewithsushil.in/1.15pageURL.html");
		driver.findElement(By.id("inputfield")).sendKeys(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.get("https://codewithsushil.in/1.16pageSource.html");
		WebElement ele = driver.findElement(By.xpath("//textarea"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).doubleClick().build().perform();
		String pagesource = driver.getPageSource();
		System.out.println("PageSource" + pagesource);
		ele.sendKeys(pagesource);
		Thread.sleep(1000);

	}

}
