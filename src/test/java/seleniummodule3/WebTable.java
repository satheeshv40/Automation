package seleniummodule3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Headers = new ArrayList<String>();
		LinkedHashMap<String, String> eachRowData = new LinkedHashMap<>();
		List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String, String>>();

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("E://Webtable.html");
		List<WebElement> NoOfRowsHeader = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		for (int i = 1; i <= NoOfRowsHeader.size(); i++) {
			String HeaderValue = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th[" + i + "]")).getText();
			Headers.add(HeaderValue);
		}
		System.out.println(Headers);
		
		

		List<WebElement> NoOfRows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		for (int i = 2; i <= NoOfRows.size(); i++) {
			List<WebElement> rowdata = driver
					.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[" + i + "]/td"));
			int colonumsize = rowdata.size();
			for (int j = 0; j < colonumsize; j++) {
				String cellValue = rowdata.get(j).getText();
				eachRowData.put(Headers.get(j), cellValue);

			}
			allTableData.add(eachRowData);

		}

		System.out.println("--> " + eachRowData);
		System.out.println("--> " + allTableData);
		
		System.out.println(eachRowData.entrySet());

	}

}
