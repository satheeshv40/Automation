package seleniummodule3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codewithsushil.in/3.05cricketScorecard.html");

		driver.findElement(By.xpath("//*[text()=\"Generate Scorecard\"]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("--> " + ele.size());

		List<Integer> values = new ArrayList<Integer>();

		for (int i = 1; i <= ele.size(); i++) {
			String value = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
			values.add(Integer.parseInt(value));
		}

		// Collections.sort(values);
		String dhonivalue;
		Collections.sort(values, Collections.reverseOrder());
		System.out.println(values);

		int largestValue = values.get(0); 
		String largestvalue = Integer.toString(largestValue);
		System.out.println("--> Largest Value is " + largestValue);
		driver.findElement(By.name("topscorer")).sendKeys(largestvalue);

		List<WebElement> ele1 = driver.findElements(By.xpath("//tbody/tr"));

		for (int j = 1; j <= ele1.size(); j++) {
			String value = driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[1]")).getText();
			System.out.println("Names are --> " + value);
			if (value.equalsIgnoreCase("Mahendra Singh Dhoni")) {
				dhonivalue = driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[2]")).getText();
				driver.findElement(By.name("sachinruns")).sendKeys(dhonivalue);
				break;
			}

		}

	}

}
