package seleniummodule1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Running Method");
		driver.get("https://codewithsushil.in/1.05married_radio.html");
		driver.findElement(By.xpath("//*[@value='0']")).click();
		driver.findElement(By.xpath("//*[@value='1']")).click();
		driver.findElement(By.xpath("//*[@value='1']")).click();

		/*
		 * WebElement dplist = driver.findElement(By.xpath("//form")); Select sel = new
		 * Select(dplist); if(sel.isMultiple()) { System.out.println("Multiple value");
		 * } sel.selectByIndex((sel.getOptions().size())-1); sel.selectByValue("0");
		 * 
		 */

	}
}
