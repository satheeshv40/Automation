package seleniummodule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/3.12hoverLink.html");
		WebElement tajlink = driver.findElement(By.partialLinkText("About Taj Mahal"));
		WebElement tajimage = driver.findElement(By.xpath("//*[@alt='User Avatar']"));
		//Select sel = new Select(tajimage);
		Actions act = new Actions(driver);
		act.moveToElement(tajimage).build().perform();
		tajlink.click();
		

	}

}
