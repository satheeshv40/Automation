package javaprogrampraticeStrings;

import java.nio.file.spi.FileSystemProvider;

public class StringEachWordCharacterCount {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String str = "all is well";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			String s = "";
			while ( i < ch.length && ch[i] != ' ') {

				s = s + ch[i];
				i++;
			}

			System.out.println(s + " --> " + s.length());
		}
	}

}
