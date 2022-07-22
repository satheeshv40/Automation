package javaprogram;

public class StringWordCountAndSplit {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int count = 1;

		/** Count number of words */
		String txt = "welcome to java  tutorial on Java2blog";
		txt=txt.toLowerCase();
		for (int i = 0; i <= txt.length() - 1; i++) {
			if ((txt.charAt(i) == ' ') && (txt.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println("Number of words in sentences are --> " + count);

		/** Count number of characters */

		int count1=1;
		for(int i=0;i<txt.length();i++) {
			if(txt.charAt(i)>='a'&&txt.charAt(i)<='z') {
				count1++;
			}
		}
		
		
		
		System.out.println("Number of charaters in sentences are --> " + count1);


		/** Split numbers from string */
		String combination = "test12all34iswell344h!@#$%^&*()_+:";
		String regex = "[^\\d]";
		
		String regex1 ="[a-zA-z]";
		String regex2= "[!@#$%^&*()_+:]";
		String[] values = combination.split(regex2);
	
		for (String value : values) {
			System.out.print(value);
		}
		
		
		

	}

}
