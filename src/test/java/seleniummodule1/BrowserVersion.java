package seleniummodule1;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserVersion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Capabilities cabs = ((RemoteWebDriver)driver).getCapabilities();
		System.out.println(cabs.getBrowserName());
		System.out.println(cabs.getVersion());
		System.out.println(cabs.getPlatform());

	}
}
