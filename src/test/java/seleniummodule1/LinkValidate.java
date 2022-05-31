package seleniummodule1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/1.01link.html");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String title = driver.findElement(By.xpath("//div[@class='container']//h3[1]")).getText();
		System.out.println(title);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
		
	}

}
