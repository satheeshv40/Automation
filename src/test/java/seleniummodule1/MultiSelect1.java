package seleniummodule1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelect1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Running Method");
		driver.get("https://codewithsushil.in/1.10selectElementFromDD.html");
		System.out.println(driver.getWindowHandles().size());
		driver.findElement(By.xpath("//button[text()='Click Me to open a Menu']")).click();
		driver.findElement(By.partialLinkText("Option 2")).click();
		System.out.println(driver.getWindowHandles().size());
		driver.close();
	}
}
