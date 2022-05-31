package selenium.module4;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class Email {

	@Test
	public static void email() throws EmailException {
		// TODO Auto-generated method stub
		System.out.println("test");
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("test717759@gmail.com", "test717759@123"));
		email.setSSLOnConnect(true);
		email.setFrom("satheeshv30@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("satheeshv.ece@gmail.com");
		email.send();
		System.out.println("Email Sent Successfully");
	}

}
