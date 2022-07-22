package javaprogrampraticeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1st Method */

		String str = "Everything is well";
		String[] strs = str.split(" ");
		System.out.println("Length " + strs.length);
		String reverse = "";
		System.out.println("Before Reverse" + str);

		for (int i = strs.length - 1; i >= 0; i--) {
			reverse = reverse + strs[i] + " ";
		}

		System.out.println("After Reverse " + reverse);

		/* 2nd Method */
		String txt = "Everything is well and life is going good";
		String[] txts = txt.split(" ");
		ArrayList<String> ar = new ArrayList<>();
		for (int i = 0; i < txts.length; i++) {
			ar.add(txts[i]);
		}

		 //Arrays.sort(strs);
		Collections.reverse(ar);
		//Collections.sort(ar,Collections.reverseOrder());

		System.out.println("ArrayList to Array " + ar.toArray());
		System.out.println("ArrayList to String " + ar.toString());
		for (String a : ar) {
			System.out.print(a + " ");
		}

		System.out.println();
		
		/* 3rd Method */

		String org = "satheesh";
		StringBuffer str1 = new StringBuffer(org);
		System.out.println(str1.reverse());

	}

}
