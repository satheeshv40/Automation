package javaprogrampraticeStrings;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String regex= "^(.+)@(.+)$";
		String email1 = "satheesh@test.com";
		String regex12 = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
		
		String regex1 ="^[\\w!#$%&'*+/=?`{|}~^-]+@[a-zA-Z0-9.]+$";
		
		
		// RFC 
        String regexrfc = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+(?:\\.[a-zA-Z0-9-]+)*$";  
        
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add(".javaTpoint@domain.co.in..");  
        emails.add("javaTpoint@domain.com");  
        emails.add("javaT-point#@domain.co.in");  
        emails.add("javaT_point@domain.com");  
        emails.add("javaTpoint@domaincom");  
        //Add invalid email in list  
        emails.add("@yahoo.com");  
        emails.add("12javaTpoint#domain.com");  

		Pattern p = Pattern.compile(regexrfc);
		for (String email:emails) {
		Matcher matcher = p.matcher(email);
		System.out.println(email +"-> "+ matcher.matches());
		}
		
	}

}
