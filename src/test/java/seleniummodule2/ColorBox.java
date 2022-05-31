package seleniummodule2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/2.09greenColorBlock.html");
		List<WebElement> noofRows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total Number of rows --> " + noofRows.size());
		for (int i = 1; i <= noofRows.size(); i++) {
			List<WebElement> boxcolour = driver.findElements(By.xpath("//table/tbody/tr[" + i + "]/td"));
			System.out.println("The Row Number -> "+ i+ "contains table data number -->"+ boxcolour.size() );
			for (int j = 1; j <= boxcolour.size(); j++) {
				String colour = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]/div"))
						.getAttribute("class");
				System.out.println(colour);
				if(colour.equalsIgnoreCase("greenbox")) {
					driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]/div")).click();
					try {
						driver.switchTo().alert().accept();
					}catch(Exception e) {
						e.printStackTrace();
					}
					break;
				}

			}
		}

	}

}
