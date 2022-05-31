package seleniummodule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codewithsushil.in/3.04color.html");
		WebElement ele = driver.findElement(By.xpath("//*[text()='I am a button']"));
		// ele.click();
		String color = ele.getCssValue("color");
		String backgroundcolor = ele.getCssValue("background-color");

		System.out.println(color + " --> " + backgroundcolor);
		WebElement TextClolor = driver.findElement(By.name("txtcolor"));
		WebElement backgroundcolor1 = driver.findElement(By.name("bgcolor"));
		TextClolor.sendKeys(color);
		backgroundcolor1.sendKeys(backgroundcolor);

		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();

		String hovercolor = driver.findElement(By.xpath("//*[text()='I am a button']")).getCssValue("color");

		act.clickAndHold(ele).build().perform();
		String holdcolor = driver.findElement(By.xpath("//*[text()='I am a button']")).getCssValue("color");
		driver.findElement(By.name("hovercolor")).sendKeys(hovercolor);
		driver.findElement(By.name("holdcolor")).sendKeys(holdcolor);

	}

}
