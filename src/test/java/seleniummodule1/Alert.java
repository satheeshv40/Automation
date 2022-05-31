package seleniummodule1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/1.12right_click.html");
		WebElement ele = driver.findElement(By.xpath("//*[@alt='Broken Image 1']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).contextClick(ele).build().perform();
		act.moveToElement(ele).contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		System.out.println("11");

	}

}
