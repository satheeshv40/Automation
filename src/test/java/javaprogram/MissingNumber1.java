package javaprogram;

import java.util.HashSet;
import java.util.Arrays;
public class MissingNumber1 {
 
    public static void main(String[] args) {
    	
        int numbers[] = { -1,-1, -3, -4,0,3, 5, 7,};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    	HashSet<Integer> hs = new HashSet<>();
    	
    	for(int i=numbers[0]; i<numbers[numbers.length-1];i++) {
    		hs.add(i);
    	}
    	
    	for(int i:hs) {
    		System.out.print(i+" ");
    	}
    	
    	for(int i= 0;i<numbers.length;i++) {
    		hs.remove(numbers[i]);
    	}
    	
    	for(int i:hs) {
    		System.out.print(i+" ");
    	}
    	
    	
 
        int arr1[] = { 1, 3, 4, 5, 5, 7, 2 };
        int arr[] = { -1,-1, -3, -4,0,3, 5, 7,};

        
        int size = arr.length;
         int i;
         
    	  for (i = 0; i < size; i++) {
              int abs_val = Math.abs(arr[i]);
              System.out.println("--> "+abs_val);
              if (arr[abs_val - 1] > 0) {
                  arr[abs_val - 1] = -arr[abs_val - 1];
              System.out.println("--> "+ arr[abs_val - 1]);
              }
              else
                  System.out.println("else-> "+abs_val);
          }
   
          System.out.print("and the missing element is ");
          for (i = 0; i < size; i++) {
              if (arr[i] > 0)
                  System.out.print(i + 1);
          }
               
    
    
    // same ----------------------------------
    
          int ar[] = { 1,3, 4, 5, 5, 7, 2 };

    for (int j=0;j<size;j++) {
    	int abs =Math.abs(ar[j]);
    	
    	if(ar[abs-1]>0) {
    		ar[abs-1]=-ar[abs-1];
    	}else
    		System.out.println(abs);
    }
    
    for (i = 0; i < size; i++) {
        if (ar[i] > 0)
            System.out.println(i + 1);
    }
    
    }
}