package seleniummodule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/3.02dragAndDropImg.html");
		WebElement source = driver.findElement(By.id("drag1"));
		System.out.println(source.getLocation().getX());
		System.out.println(source.getLocation().getY());

		System.out.println(source);
		WebElement drop = driver.findElement(By.id("div1"));
		Actions act = new Actions(driver);
		// act.moveToElement(source).clickAndHold(source).moveToElement(drop).release().build().perform();
		// act.moveToElement(source).dragAndDropBy(source,549,298).build().perform();
		// act.moveToElement(source).clickAndHold(source).moveByOffset(549,298).build().perform();
		act.moveByOffset(549, 292).clickAndHold(source).moveToElement(drop).build().perform();
		// act.moveToElement(source).dragAndDropBy(source, 275, 225).build().perform();
		System.out.println("code executed");

	}

}
