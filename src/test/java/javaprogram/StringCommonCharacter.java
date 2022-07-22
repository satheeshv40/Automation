package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Arrays;

public class StringCommonCharacter {

	static int MAX_CHAR = 26;

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1st Method wont work */
		
		String[] strs = { "bella", "label", "roller" };
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < strs.length; i++) {
			char[] ch = strs[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {
				if (map.containsKey(ch[j])) {
					int count = map.get(ch[j]);
					map.put(ch[j], count++);
				} else {
					map.put(ch[j], 1);
				}
			}
			// System.out.println("--> "+map);

		}

		System.out.println("--> " + map);
		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

		/* Working Method */
		
		
		String[] str = { "bella", "label", "roller" };

		int n = str.length;
		// primary array for common character
		// we assume all character are seen before

		 // primary array for common characters
        // we assume all characters are seen before.
        Boolean[] prim = new Boolean[MAX_CHAR];
        Arrays.fill(prim, true);
        // for each string
        for (int i = 0; i < n; i++) {
             // secondary array for common characters
            // Initially marked false
            Boolean[] sec = new Boolean[MAX_CHAR];
            Arrays.fill(sec, false);
 
            // for every character of ith string
            for (int j = 0; j < str[i].length(); j++)
            {
 
                // if character is present in all
                // strings before, mark it.
                if (prim[str[i].charAt(j) - 'a'])
                sec[str[i].charAt(j) - 'a'] = true;
            }
 
            // copy whole secondary array into primary
            System.arraycopy(sec, 0, prim, 0, MAX_CHAR);
        }
 
        // displaying common characters
        for (int i = 0; i < 26; i++)
            if (prim[i]){
                System.out.print(Character.toChars(i
                                               + 97));
                System.out.print(" ");
            }
    }
}