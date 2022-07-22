package javaprogrampraticeStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringSortingAndAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Single String Sorting */
		String str = "satheesh";
		char ch[] = str.toCharArray();
		System.out.println(ch);

		Arrays.sort(ch);
		System.out.println(ch);

		/* 2nd Method */

		String st1 = "satheesh";
		char[] arrq = st1.toCharArray();

		for (int i = 0; i < st1.length(); i++) {
			for (int j = i + 1; j < st1.length(); j++) {
				if (arrq[i] > arrq[j]) {
					char temp = arrq[i];
					arrq[i] = arrq[j];
					arrq[j] = temp;
				}
			}

		}

		/* String Array sorting 1st Method */

		String[] country = { "great", "paris", "borabora", "florence", "paris", "tokyo", "cusco" };
		Arrays.sort(country);
		System.out.println("sorted country " + country);
		System.out.println(Arrays.toString(country));

		/* String Array sorting 2nd Method */

		String[] places = { "great", "paris", "borabora", "florence", "paris", "tokyo", "cusco", "adyar" };
		int length = places.length;
		System.out.println(Arrays.toString(places));
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (places[i].compareTo(places[j]) > 0) {
					String temp = places[i];
					places[i] = places[j];
					places[j] = temp;
				}
			}
		}

		System.out.println("sorted places " + places);
		System.out.println(Arrays.toString(places));

		/* Anagram 1st Method */

		String ana1 = "CAT";
		String ana2 = "ATC";

		char[] a = ana1.toCharArray();
		char[] b = ana2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));

		/* Anagram 2nd Method */

		String newana1 = "ROSE";
		String newana2 = "ROES";
		char[] arr1 = newana1.toCharArray();
		char[] arr2 = newana2.toCharArray();

		HashMap<Character, Integer> map1 = new LinkedHashMap<>();
		HashMap<Character, Integer> map2 = new LinkedHashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			if (map1.get(arr1[i]) == null) {
				map1.put(arr1[i], 1);
			} else {
				Integer c = map1.get(arr1[i]);
				map1.put(arr1[i], ++c);

			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map2.get(arr2[i]) == null) {
				map2.put(arr2[i], 1);
			} else {
				Integer c = map2.get(arr1[i]);
				map1.put(arr2[i], ++c);

			}
		}

		System.out.println(map1.equals(map2));

	}
}