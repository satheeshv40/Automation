package javaprogram;

import java.util.HashSet;
import java.util.Arrays;
public class ArrayRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	        int n = arr.length;
		HashSet<Integer> hp = new HashSet<>();
		
		for (int i=0;i<arr.length;i++) {
			hp.add(arr[i]);
		}
	        
		System.out.println(hp);
		  int j = 0;
	      
	        // Doing same as done in Method 1
	        // Just maintaining another updated index i.e. j
	        for (int i = 0; i < n-1; i++)
	            if (arr[i] != arr[i+1])
	                arr[j++] = arr[i];
	      
	        arr[j++] = arr[n-1];
	      
	      System.out.println(j);
	      
	      for (int i=0; i<n; i++)
	           System.out.print(arr[i]+" ");

	}

}
