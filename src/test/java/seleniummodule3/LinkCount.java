package seleniummodule3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codewithsushil.in/3.03linkCount.html");
		List<WebElement> Guru99=driver.findElements(By.xpath("//a[@href='https://www.guru99.com/selenium-tutorial.html']"));
		System.out.println(Guru99);

	}

}
