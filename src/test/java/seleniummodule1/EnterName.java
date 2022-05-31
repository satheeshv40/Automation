package seleniummodule1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		driver.get("https://codewithsushil.in/1.02text_field.html");
		driver.findElement(By.id("namefield")).sendKeys("Satheesh");
		Thread.sleep(1000);
		driver.get("https://codewithsushil.in/1.03age_plceholder.html");
		driver.findElement(By.name("age")).click();
		driver.findElement(By.name("age")).clear();
		driver.findElement(By.id("agefield")).sendKeys("32");
		Thread.sleep(1000);
		driver.close();
		
	}

}
