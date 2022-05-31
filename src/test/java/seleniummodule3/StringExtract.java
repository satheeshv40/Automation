package seleniummodule3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringExtract {

	public static String cutvalue;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://codewithsushil.in/3.09copyAndPasteTextAdvanced.html");

		WebElement link = driver.findElement(By.xpath("//button[@type='button']//following-sibling::h3[1]"));
		String value = link.getText();
		System.out.println(value);
		/** Pattern to extract the text presented in double quotes */
		Pattern p = Pattern.compile("\"([^\"]*)\"");
		Matcher m = p.matcher(value);
		System.out.println("--> " + m);

		while (m.find()) {
			cutvalue = m.group(1);
		}

		driver.findElement(By.name("pasteBox")).sendKeys(cutvalue);

// regex with split Not worked 

	}
}
