package seleniummodule3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		String currentMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Actions act = new Actions(driver);
		System.out.println("--> " + currentMonth);
		if (!currentMonth.equalsIgnoreCase("December 2022")) {
			do {
				// driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				act.moveToElement(driver.findElement(By.xpath("//span[@aria-label='Next Month']"))).click().perform();
				/*
				 * WebElement ele
				 * =driver.findElement(By.xpath("//span[@class='langCardClose']"));
				 * if(ele.isDisplayed()) { ele.click(); }
				 */
				String currentMonth1 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div"))
						.getText();
				System.out.println(" -->  " + currentMonth1);
			} while (!driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText().trim()
					.equalsIgnoreCase("December 2022"));
		}

		act.moveToElement(driver.findElement(By.xpath("//*[@aria-label='Thu Dec 15 2022']"))).click().perform();

	}

}