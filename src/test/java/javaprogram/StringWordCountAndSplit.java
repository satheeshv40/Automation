package javaprogram;

public class StringWordCountAndSplit {

	static int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Count number of words
		String txt = "welcome to java  tutorial on Java2blog";
		for (int i = 0; i <= txt.length() - 1; i++) {
			if ((txt.charAt(i) == ' ') && (txt.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println("Number of words in sentences are --> " + count);
	
	// Spliting numbers from string
	String combination = "test12all34iswell344h";
	String regex = "[^\\d]";
	String[] values =combination.split(regex);
	for(String value:values) {
		System.out.print(value);
	}
		
	}

}
