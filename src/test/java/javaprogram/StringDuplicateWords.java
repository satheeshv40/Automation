package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Java is a programming language. Python is also a programming language.";
		input = input.toLowerCase();
		String[] inputs = input.split(" ");
		for (String txt:inputs) {
		System.out.println(txt);	
		}
		
		/** 1st Method by using set */
		
		List<String> repeatedwords = new ArrayList<String>();
		Set<String> uniquedwords = new HashSet<String>();
		for(String str:inputs) {
			if(!uniquedwords.add(str)) {
				repeatedwords.add(str);
			}
		}
		
						
		System.out.println("The repeated words in a sentenses are " +repeatedwords);
		System.out.println("The Non repeated words in a sentenses are " +uniquedwords);
	
		// 2nd Method 
		for (int i=0; i<inputs.length;i++) {
			for (int j=i+1; j<inputs.length;j++) {
				if (inputs[i].equals(inputs[j])) {
					System.out.println("The same words are --> " + inputs[i]);
				}
			}
		}
		
		
		/* String Swap without using temp variable */
		
		String str1 = "Good";
		String str2 ="Morning";
		System.out.println("Before Swap --> "+ str1+" "+ str2);
		str1= str1+str2;
		str2 = str1.substring(0, (str1.length()-str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println("After Swap --> "+ str1+" "+ str2);
		
		/* String Swap with using temp or third variable */
		String str3 = "Good";
		String str4 ="Morning";
		String temp;
		temp=str3;
		str3=str4;
		str4=temp;
		System.out.println(str3+" "+str4);
		
		
		List<Character> reperatedcharacter = new ArrayList<Character>();
		Set<Character> uniquecharacter = new HashSet<Character>();
		
		String txt ="satheesh";
		for(int i=0; i<txt.length();i++) {
			if(!uniquecharacter.add(txt.charAt(i))) {
				reperatedcharacter.add(txt.charAt(i));
			}
		}
		System.out.println(reperatedcharacter.toString());
		System.out.println(uniquecharacter.toString());
		
		String txt1 ="satheesh";
		char[] ch= txt1.toCharArray();
		Arrays.sort(ch);
		/* Wont Work
		String Sorting="";
		for(int i=0; i<txt1.length();i++) {
			for(int j=i+1; j<txt1.length();j++) {
				if(txt1.charAt(i)>txt1.charAt(j)) {
					Sorting=Sorting +txt1.charAt(i);

				}
			}
		}
		
		System.out.println("--> "+ Sorting);
		*/
	}
	

}
