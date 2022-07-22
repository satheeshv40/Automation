package javaprogram;

import java.util.Arrays;
import java.util.Collections;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** Without Using sort method */
		
		String[] places = {"Great Barrier Reef", "Paris", "BoraBora", "Florence","Paris","Tokyo", "Cusco"};
		int length = places.length;
		for (int i=0;i<length-1;i++) {
			
			for (int j=i+1; j<length;j++) {
				
				if(places[i].compareTo(places[j])>0) {
					String temp = places[i];
					places[i]=places[j];
					places[j]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(places));
		
		/** With Using Sorting Method */
		
		String[] fruits = {"Chiko", "Watermelon", "Apple", "Carrot","Banane","Grape", "Lemon"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
		/** Single String Sorting */
		
		String str1 = "Brag";
		String str2 = "Grab";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		char[] chararray1 = str1.toCharArray();
		char[] chararray2 = str2.toCharArray();
		
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		
		System.out.println(Arrays.equals(chararray1,chararray2));

		 
		String sorted = new String(chararray1);
		String sorted1 = new String(chararray2);
		
		
		System.out.println(sorted.equalsIgnoreCase(sorted1));
		
		/** Single String Sorting */
		// Wont work
		String st = "satheesh";
		String sorting ="";
		for(int i=0; i<st.length();i++) {
			for(int j=i+1;j<st.length();j++) {
				if(st.charAt(i)>st.charAt(j)) {
					sorting=sorting +st.charAt(i);
				}
			}
		}
		
		System.out.println(st+" --> "+ sorting);
		
		String st1 = "satheesh";
		char temp;
		char arrq[] = st1.toCharArray();
		System.out.println("-->" + arrq);
		for(char c:arrq) {
			System.out.print(c);
		}
		for(int i=0; i<st1.length();i++) {
			for(int j=i+1;j<st1.length();j++) {
				if(arrq[i]>arrq[j]) {
					temp =arrq[i];
					arrq[i]=arrq[j];
					arrq[j]=temp;
				}
			}
		}
		
		System.out.println("-->" + arrq);
		System.out.println(Arrays.toString(arrq));

		String a = new String(arrq);
		System.out.println(a);
		for(char d:arrq) {
			System.out.print(d);
		}
		
		String str = "satheesh";
	       
		
	}

}
