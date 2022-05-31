package javaprogram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		String email = "test@gmail.com";

		String[] str = email.split(regex);
		for (String st : str) {
			System.out.println("-->" + st);
		}

		Matcher matcher = pattern.matcher(email);
		System.out.println(email + " :\"\" " + matcher.matches());

		/**
		 * to escape we need to use \" \"
		 */

		// String regex1= "^(.+)@(.+)$";

		String regex1 = "^[A-Za-z0-9+_.'-]+@(.+)$";

		ArrayList<String> emails = new ArrayList<String>();

		emails.add("javaTpoint@domain.co.in");
		emails.add("javaTpoint@domain.com");
		emails.add("javaTpoint.name@domain.com");
		emails.add("javaTpoint#@domain.co.in");
		// Add invalid emails in list
		emails.add(".javaTpoint@yahoo.com");
		emails.add("javaTpoint@yahoo.com.");
		emails.add("javaTpoint@yahoo..com");
		emails.add("javaTpoint@yahoo.c");
		emails.add("javaTpoin;t@yahoo.corporate");
		emails.add("java'Tpoint@domain.com");
		// Regular Expression

		Pattern pattern1 = Pattern.compile(regex1);

		for (String emai : emails) {
			Matcher match = pattern1.matcher(emai);
			// match.matches();
			System.out.println(emai + " : " + match.matches());

		}

		System.out.println(" ------------------ ");

		String regex2 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pn = Pattern.compile(regex2);

		for (String email1 : emails) {
			Matcher match = pn.matcher(email1);
			// match.matches();
			System.out.println(email1 + " : " + match.matches());

		}
	}

}