package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringMaximumOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bellaaasatheeseheesh";
		 // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[256];
      
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
            	System.out.println("--> "+count[str.charAt(i)]);
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
System.out.println(result);	
	}

}
