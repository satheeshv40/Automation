package javaprogrampraticeStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		String txt = "satheesh";

		char[] ch = txt.toCharArray();

		for (int i = 0; i < txt.length(); i++) {
			for (int j = i + 1; j < txt.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j]);
				}

			}
		}

		System.out.println();

		/* 2nd Method Frequency */

		String txt1 = "zLife is wonderfull and beautyfull";
		int size = txt1.length();
		int count = 0;
		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {

			char c = txt1.charAt(i);

			// counting the number of occurrence of character in a string
			for (int j = 0; j < size; j++) {
				if (txt1.charAt(j) != c) {
					continue;
					// count ++;
				}
				count++;
			}

			// checking if we printed character already
			if (!list.contains(c)) {
				if (count > 1 && c != ' ') {
					System.out.println( c + " --> " + count);
				}
			}

			// Setting counter to 0 for next character count
			count = 0;

		}

		/* 3rd Method */

		String str = "MyName is happy";
		List<Character> re = new ArrayList<>();
		Set<Character> un = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			if (!un.add(str.charAt(i))) {
				re.add(str.charAt(i));
			}
		}
		System.out.println(re.toString());

		System.out.println(un.toString());

		/* 4th Method */

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		String val = "Life as to run successfully and neatfully and carefully";
		for (int i = 0; i < val.length(); i++) {
			if (map.containsKey(val.charAt(i))) {
				int c = map.get(val.charAt(i));
				map.put(val.charAt(i), ++c);
			} else {
				map.put(val.charAt(i), 1);
			}
		}

		System.out.println("1 " + map.toString());
		System.out.println("2 " + map.keySet());
		System.out.println("3 " + map.entrySet());
		for (Entry<Character, Integer> entry : map.entrySet()) {
			//System.out.print(entry.getKey() + " --> " + entry.getValue() + " ");

			if (entry.getValue() > 1) {
				System.out.print("Key " + entry.getKey() + "and the value is " + entry.getValue()+ " ");
			}

		}

	}

}
