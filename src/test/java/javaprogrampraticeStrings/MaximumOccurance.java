package javaprogrampraticeStrings;

import java.util.Arrays;

public class MaximumOccurance {

	static final int ASCII_SIZE = 256;

	// 0 to 127 if we know the character of the string // a-97
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "all is well";

		int[] count = new int[ASCII_SIZE];

		int length = str.length();
		System.out.println(length);
		System.out.println(str.lastIndexOf('l')+1);

		for (int i = 0; i < length; i++) {
			count[str.charAt(i)]++;
		}

		System.out.println(Arrays.toString(count));

		for (int i : count) {
			System.out.println(i);
		}
		int max =0;
		char result =' ';
		
		for (int i=0;i<length;i++) {
			if(max<count[str.charAt(i)]) {
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		
		
		System.out.println("Maximum occurance is --> "+result );
		
		
		// trying to min occurance
		int min =0;
		for (int i=0;i<length;i++) {
			if(count[i]!=0) {
				if (count[min]==0 ||count[i]<count[min]) {
					min =i;
				}
			}
		}
		char result1 = ' ';
		result1 = str.charAt(min);
		System.out.println(result1);
		System.out.println("--> " +min +count[str.charAt(min)]);
	}

}
