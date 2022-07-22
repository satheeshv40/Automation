package javaprogrampraticeStrings;

import java.util.ArrayList;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Count number of words */

		String str = "welcome to java  tutorial on Java2blog";
		System.out.println(str.length());
		int size = str.length();
		int count = 1;

		for (int i = 0; i < size; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				++count;
			}
		}

		System.out.println("total number of words " + count);

		/* 2nd Method */
		String[] strs = str.split(" ");
		System.out.println(strs.length);
		
		String[] st =str.split("\\s+");
		System.out.println(st.length);
		
		 String word="";
		/* Character count */

		int count1 = 1;

		for (int i = 0; i < size; i++) {
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) {
				++count1;
			}
		}

		System.out.println("total number of character " + count1);

		/* 3rd Method */
		
		System.out.println(str.lastIndexOf('1'));
		
		
		/* 4th Method*/
		
		String str1 = "welcome to java  tutorial on Java2blog welcome to java and java is the program";
		
		ArrayList<String> words = new ArrayList<>();
		
		String[] str11 =str1.split("\\s+");
		
		for (String s:str11) {
			words.add(s);
		}
		
		System.out.println(words.toString());
		
		int maxcount=0;
		for(int i=0;i<words.size();i++) {
			int count11 =1;
			for (int j=i+1; j<words.size();j++) {
				if(words.get(i).equals(words.get(j))) {
					count11 ++;
				}
			}
			
			
			if (maxcount<count11) {
                maxcount = count11;    
               word = words.get(i);
			}
		}
		
        System.out.println("Most repeated word: " + word);    

        
        /* 5th method */
        
		String str2 = "welcome to java  tutorial on Java2blog welcome to java and java is the program";
		char[] ch =str2.toCharArray();
		ArrayList<Character> ca = new ArrayList<>();
		for(char c:ch) {
			ca.add(c);
		}
		
		char re= ' ';
		int cc1=0;
		for (int i=0;i<ca.size();i++) {
			int cc=1;
			for (int j=i+1;j<ca.size();j++) {
				if (ca.get(i).equals(ca.get(j))) {
					cc++;
				}
			}
			 if(cc1<cc) {
				 cc1=cc;
				re = ca.get(i);
			 }
			
		}
		
        System.out.println("Most repeated character: " + re);    

	}
}