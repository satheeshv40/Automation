
package javaprogram;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "KAYAK";
		str = str.toLowerCase();

		StringBuilder sb = new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		String reversing = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversing = reversing + str.charAt(i);

		}
		System.out.println("reversing --> " + reversing);
		System.out.println("--> " + reverse);

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				boolean flag = false;
				break;
			}
		}
		if (true) {

		}
		
	
	}

}
