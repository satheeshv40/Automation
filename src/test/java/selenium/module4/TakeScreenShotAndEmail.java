package selenium.module4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShotAndEmail {

	@Test
	public static void screenshotemail() throws EmailException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/4.05screeshotToEmail.html");
		TakesScreenshot tsc = (TakesScreenshot) driver;
		File src = tsc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + System.currentTimeMillis() + ".png");
		String dest1 = dest.toString();
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Email Started");
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath(dest1);
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Picture of John");
		attachment.setName("John");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("test717759@gmail.com", "test717759@123"));
		email.setSSLOnConnect(true);
		email.setHostName("smtp.gmail.com");
		email.addTo("satheeshv.ece@gmail.com");
		email.setFrom("test717759@gmail.com");
		email.setSubject("The picture");
		email.setMsg("Here is the picture you wanted");

		// add the attachment
		email.attach(attachment);

		// send the email
		email.send();
		System.out.println("Email Sent");
	}

}
