package seleniummodule3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyLoadingIconOnPageRefresh {



	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://codewithsushil.in/4.01verifyLoadingIcon.html");
		Thread.sleep(2000);
		/** We can do using source in network tab - Event Listener Breakpoints
		There are multiple breakpoints available like ,
		Mouseover(click, mouseup, mousedown, mouseover, mousemove, up, down,),
	 	click, Keyboard(keyup, keydown, keypress), Load(load, sucess, naviagteto, naviagtefrom, finish), 
		*/
		Boolean value =driver.findElement(By.xpath("//*[@id='box']")).isEnabled();
		System.out.println(value);
	}
}
