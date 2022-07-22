package javaprogrampraticeStrings;

import java.util.Arrays;

public class CommonCharacterStringArray {

	static int MAX_CHAR = 26;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "bella", "label", "roller" };


		Boolean[] prim = new Boolean[MAX_CHAR];

		Arrays.fill(prim, true);
		System.out.println(Arrays.toString(prim));

		for (int i = 0; i < str.length; i++) {

			Boolean[] sec = new Boolean[MAX_CHAR];
			Arrays.fill(sec, false);
			for (int j = 0; j < str[i].length(); j++) {
				if (prim[str[i].charAt(j) - 'a'])
					sec[str[i].charAt(j) - 'a'] = true;
			}
			
			System.arraycopy(sec, 0, prim, 0, MAX_CHAR);
			System.out.println("--> "+ Arrays.toString(sec));

		}
		
		System.out.println(Arrays.toString(prim));

		
		for (int i=0;i<26;i++) {
			if(prim[i]) {
				System.out.print(Character.toChars(i+ 97));
				System.out.print(" ");

			}
		}

	}

}
