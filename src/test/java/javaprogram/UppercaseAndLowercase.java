package javaprogram;

public class UppercaseAndLowercase {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        
		/** Lowercase to uppercase and uppercase to lowercase */
		String str="Great Power";    
        StringBuffer newstr = new StringBuffer(str);
        
        for(int i=0;i<str.length();i++) {
        	if(Character.isLowerCase(str.charAt(i))) {
        		newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        	}else if (Character.isUpperCase(str.charAt(i))){
        		newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
        	}
        }

        System.out.println(newstr);
        
        
        
        
	}

}
