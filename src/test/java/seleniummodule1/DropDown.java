package seleniummodule1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Running Method");
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		//selectChoice(driver, "choice 1");
		selectChoice(driver, "choice 6 2","choice 6 2 1","choice 6 2 2","choice 6 2 3");
		//selectChoice(driver, "all");
		String[] arr = {"choice 1","choice 2","choice 2 1","choice 2 2", "choice 2 3"};
		selectChoice1(driver,arr);


	}

	public static void selectChoice(WebDriver driver, String... values) {

	List<WebElement> choices=	driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	if(!values[0].equalsIgnoreCase("all")) {
		for (WebElement choice:choices) {
			String text= choice.getText();
			for (String value:values) {
				if(value.equalsIgnoreCase(text)) {
					choice.click();
					break;
				}
			}
		}
	}else {
		for (WebElement choice:choices) {
			choice.click();
		} 
	}
	
	}
	
	public static void selectChoice1(WebDriver driver, String values[]) {

		List<WebElement> choices=	driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!values[0].equalsIgnoreCase("all")) {
			for (WebElement choice:choices) {
				String text= choice.getText();
				for (String value:values) {
					if(value.equalsIgnoreCase(text)) {
						choice.click();
						break;
					}
				}
			}
		}else {
			for (WebElement choice:choices) {
				choice.click();
			} 
		}
		
		}
}
