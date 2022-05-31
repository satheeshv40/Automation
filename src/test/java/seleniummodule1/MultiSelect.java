package seleniummodule1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Running Method");
		driver.get("https://codewithsushil.in/1.09mutiple_value_dropdown.html");
		WebElement dplist = driver.findElement(By.xpath("//select"));
		Select sel = new Select(dplist);
		if(sel.isMultiple()) {
			System.out.println("Multiple value");
		}
		sel.selectByIndex((sel.getOptions().size())-1);
		sel.selectByVisibleText("Five");
		System.out.println(sel.getAllSelectedOptions()); // we can able to print it, bcz object will be returned
		driver.close();
		
		/** Select class methods
		 sel.getAllSelectedOptions();
		sel.getFirstSelectedOption();
		sel.getOptions();
		sel.selectByIndex(1);
		sel.selectByValue("");
		sel.selectByVisibleText("");
		sel.deselectAll();
		sel.deselectByIndex(1);
		sel.deselectByValue("");
		sel.deselectByVisibleText("");
		*/
		

	}

}
