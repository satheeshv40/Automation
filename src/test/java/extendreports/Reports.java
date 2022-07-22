package extendreports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	ExtentReports extent ;
	ExtentSparkReporter spark;
	ExtentTest test;
	WebDriver driver;

	public String getBrowserName() {
		Capabilities cabs = ((RemoteWebDriver)driver).getCapabilities();
		return cabs.getBrowserName();
	}

	public String getVersion() {
		Capabilities cabs = ((RemoteWebDriver)driver).getCapabilities();
		return cabs.getVersion();
	}
	
	public String captureScreenshot(String methodname) {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+"_"+methodname+".png";
		File des = new File (path);
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("path is "+ path);
		return path;

	}
	
	public Platform getPlatform() {
		Capabilities cabs = ((RemoteWebDriver)driver).getCapabilities();
		return cabs.getPlatform();
	}
	
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(System.getProperty("user.dir"));
	}
	
	
	
	@BeforeTest
	public void set(){
		extent = new ExtentReports();
		//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/STMExtentReport.html");
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/ExtentReport.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Test");
		extent.attachReporter(spark);


	}

	@Test
	public void Alert() {
	test=extent.createTest("Alert Test").assignAuthor("satheesh").assignDevice(getBrowserName()).assignDevice(getVersion()).assignCategory("Smoke Test").assignCategory("Regression");
	driver.get("https://codewithsushil.in/1.12right_click.html");
	WebElement ele = driver.findElement(By.xpath("//*[@alt='Broken Image 1']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).contextClick(ele).build().perform();
	act.moveToElement(ele).contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	test.pass("Alert test passed");

	}
	
	@Test
	public void Click() {
	test=extent.createTest("Click Test").assignAuthor("satheesh V 1").assignDevice("Firefox").assignDevice(getVersion()).assignCategory("Sanity Test").assignCategory("Functional");
	driver.get("https://codewithsushil.in/1.07button.html");
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	driver.findElement(By.xpath("//*[@href='1.07button_validate.html']")).sendKeys(Keys.ENTER);
	System.out.println("Element Clicked");
	WebElement ele = driver.findElement(By.xpath("//*[@href=\"1.07button.html\"]"));
	WebDriverWait wait= new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
	test.pass("passed");
	}
	

	@Test
	
	public void EnterName() {
		test=extent.createTest("EnterName Test").assignAuthor("satheesh V").assignDevice("IE").assignDevice(getVersion()).assignCategory("Sanity Test").assignCategory("Functional");
		driver.get("https://codewithsushil.in/1.02text_field.html");
		driver.findElement(By.id("namefield")).sendKeys("Satheesh");
		driver.get("https://codewithsushil.in/1.03age_plceholder.html");
		driver.findElement(By.name("age")).click();
		driver.findElement(By.name("age")).clear();
		driver.findElement(By.id("agefield")).sendKeys("32");
		test.fail("Failed");

		}

	
	@AfterMethod
	public void aftermethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE || result.getStatus()==ITestResult.SUCCESS ) {
			String temp =captureScreenshot(result.getName());
			System.out.println("Temp -> "+ temp);
			test.addScreenCaptureFromPath(temp);
			test.addScreenCaptureFromBase64String(temp);
		}
		
			System.out.println("Completed "+ result.getStatus()+ " -- " +result.getName());
			extent.flush();
	}
	
	@AfterTest
	public void closebrowser() {
		driver.close();
	}
}
