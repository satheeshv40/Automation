package javaprogram;

import java.util.ArrayList;
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
		
		// 1st Method by using set
		
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
	}

}
