package javaprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;
public class MissingNumber2 {
 
    public static void main(String[] args) {
    	
        int numbers[] = { -1,-1, -3, -4,0,3, 5, 7,};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

    	HashSet<Integer> hs = new LinkedHashSet<>();
    	
    	for(int i=numbers[0]; i<numbers[numbers.length-1];i++) {
    		hs.add(i);
    	}
    	
    	for(int i:hs) {
    		System.out.print(i+" ");
    	}
    	
    	for(int i= 0;i<numbers.length;i++) {
    		hs.remove(numbers[i]);
    	}
    	
    	System.out.println();
    	for(int i:hs) {
    		System.out.print(i+" ");
    	}
    	
    	
    }
}