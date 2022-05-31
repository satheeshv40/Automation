package seleniummodule3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectJavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");

		// Locating departure date calendar
		WebElement departCal = driver.findElement(By.id("datepicker"));
		// HandlingAnyCalendarUsingJavaScript.setDateUsingJavaScriptInCalendar(driver,"10/09/2017",departCal);
		departCal.click();
		List<WebElement> months = driver.findElements(By.xpath("//*[@class='ui-datepicker-month']/option"));
		for (WebElement month : months) {
			String monthvalue = month.getText();
			if ("Dec".equalsIgnoreCase(monthvalue)) {
				month.click();
			}
		}

		driver.findElement(By.xpath("//*[@data-date='27']")).click();

		/** Selecting date with date picker */
		
		driver.navigate().to("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		System.out.println("Page Refreshed");
		String value = "10/09/2017";
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String script = "arguments[0].setAttribute('value','" + value + "');";
		jse.executeScript(script, driver.findElement(By.id("datepicker")));
		String selectedDate = driver.findElement(By.id("datepicker")).getAttribute(value);
		System.out.println("Selected Date is --> " + selectedDate);
	}

}
