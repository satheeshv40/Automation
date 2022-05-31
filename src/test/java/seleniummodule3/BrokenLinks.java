package seleniummodule3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	static int validcount ;
	static int invalidcount;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://demoqa.com/broken");
		driver.get("https://www.google.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + links.size());
		
		
		for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            System.out.println("url --> "+url);
            verifyLinks(url);
        }

		System.out.println("valid Link counts are"  +validcount+ " And Invalid link counts are "+invalidcount );
	}

	public static void verifyLinks(String urlLink) throws IOException {
		
		URL url = new URL(urlLink);
		HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
		httpconnect.setConnectTimeout(5000);
		httpconnect.connect();
		if (httpconnect.getResponseCode()==200) {
			System.out.println("URL Link is "+urlLink+" message is "+httpconnect.getResponseMessage().toString() );
			validcount++;
		}if(httpconnect.getResponseCode()==404){
			System.out.println("URL Link is "+urlLink+" message is "+httpconnect.getResponseMessage().toString() );
			invalidcount++;
		}
		
	}
}
