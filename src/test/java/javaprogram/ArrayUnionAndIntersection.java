package javaprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Arrays;


public class ArrayUnionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int arr1[] = {7, 1, 5, 2, 3, 6} ;
		int arr2[] = {3, 8, 6, 20, 7} ;
		
		for(int  i=0; i<arr1.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j]);
				}
			}
		}
		

		/* Union of two array */
		
		System.out.println();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int  i=0; i<arr1.length;i++) {
		hs.add(arr1[i]);
		}		
		
		for(int  i=0; i<arr2.length;i++) {
			hs.add(arr2[i]);
		}
		
		System.out.println(hs.toString());
		
		
		/* */
		HashMap<Integer,
        Integer> mp = new HashMap<Integer,
                                  Integer>();
		
		int arr3[] = {7, 1, 5, 2, 3, 6} ;
		int arr4[] = {3, 8, 6, 20, 7} ;
		
		for(int  i=0; i<arr1.length;i++) {
			mp.put(arr3[i], i);
			}		
			
			for(int  i=0; i<arr2.length;i++) {
				mp.put(arr4[i], i);
			}

			for(Entry<Integer, Integer> entry :mp.entrySet()) {
			System.out.print(entry.getKey()+ " ");
			}
			

			/* 3rd Method */
	Integer[] ar = {7, 1, 5, 2, 3, 6} ;
	Integer ar1[] = {3, 8, 6, 20, 7} ;
	
	HashSet<Integer> set1 = new HashSet<>(Arrays.asList(ar));
	HashSet<Integer> set2 = new HashSet<>(Arrays.asList(ar1));
	
	set1.retainAll(set2);
	
	
	System.out.println(set1);

}
}