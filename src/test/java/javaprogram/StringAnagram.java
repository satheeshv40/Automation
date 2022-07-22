package javaprogram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1 = "Brag";
		String str2 = "Grab";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		}

		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		System.out.println(Arrays.equals(string1, string2));

		 
		String sorted = new String(string1);
		String sorted1 = new String(string2);
		
		
		System.out.println(sorted.equalsIgnoreCase(sorted1));
		
		/*
		 * String str3 = "Brag"; String str4 = "Grab";
		 * 
		 * char[] ch= {}; for(int i=0; i<str3.length();i++) {
		 * 
		 * for(int j=i+1;j<str3.length();j++) {
		 * 
		 * if(str3.charAt(i)>str3.charAt(i)) { //temp =
		 * 
		 * } } }
		 */

		/* Using HashMap */
		
		
		String st1 = "abacerr";
		String st2 = "acarber";
		LinkedHashMap<Character, Integer> map1= new LinkedHashMap<>();
		HashMap<Character, Integer> map2= new HashMap<>();
		
		char[] arr1= st1.toCharArray();
		char[] arr2=st2.toCharArray();
		
		
		for (int i=0; i<arr1.length;i++) {
			System.out.println(map1.get(arr1[i])==null);
			if(map1.get(arr1[i]) == null) {
				map1.put(arr1[i],1);
			}else {
				Integer c = (int) map1.get(arr1[i]);
				map1.put(arr1[i],++c);

			}
		}
		
		System.out.println(map1);
		
		for (int i=0; i<arr2.length;i++) {
			if(map2.get(arr2[i]) == null) {
				map2.put(arr2[i],1);
			}else {
				Integer c = (int)map2.get(arr2[i]);
				map2.put(arr2[i],++c);

			}
		}

		System.out.println(map2);
		if(map1.equals(map2)){
			System.out.println("String are anagram   "
					+ "");
		}
		
		System.out.println(map1.keySet());
		
		System.out.println(map1.entrySet());
		System.out.println(map2.entrySet());

		for(Entry<Character, Integer> entry: map1.entrySet()) {
			System.out.println("Key --> "+ entry.getKey() +" value --> "+ entry.getValue() );
			
			
			}
		
		
		
	}

}
