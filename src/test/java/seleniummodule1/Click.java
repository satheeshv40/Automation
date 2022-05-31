package seleniummodule1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Running Method");
		driver.get("https://codewithsushil.in/1.07button.html");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//*[@href='1.07button_validate.html']")).sendKeys(Keys.ENTER);
		System.out.println("Element Clicked");
		WebElement ele = driver.findElement(By.xpath("//*[@href=\"1.07button.html\"]"));
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

	}

}
