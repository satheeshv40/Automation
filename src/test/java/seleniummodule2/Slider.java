package seleniummodule2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/2.11slider.html");
		WebElement source = driver.findElement(By.xpath("//*[@min='0.0']"));
		System.out.println(source.getLocation().getX());
		System.out.println(source.getLocation().getY());
		Actions act = new Actions(driver);
		act.moveToElement(source).clickAndHold(source).moveByOffset(275,225).build().perform();
		act.moveToElement(source).dragAndDropBy(source, 275, 225).build().perform();
		System.out.println("code executed");

	}

}
