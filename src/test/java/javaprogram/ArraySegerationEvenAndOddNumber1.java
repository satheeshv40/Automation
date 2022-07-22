package javaprogram;

import java.util.Collections;
import java.util.Arrays;

public class ArraySegerationEvenAndOddNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 4, 5, 3, 7, 2, 1};
		System.out.println("Numbe of Array --> "+ arr.length);
		int LI=0;
		int RI=arr.length-1;
		int evennum=0;
		
	
		while(LI<RI) {
			
			while(arr[LI]%2!=0) {
				LI++;
				evennum++;
			}
			
			while(arr[RI]%2==0 & LI<RI) {
				RI--;
			}
			
			if(LI<RI) {
				int temp =arr[LI];
				arr[LI]=arr[RI];
				arr[RI]=temp;
				
			}
			
		}

		System.out.println(evennum);
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
		
		for(int i=0;i<evennum;i++) {
			for(int j=i+1; j<evennum;j++) {
				if(arr[i]>arr[j]) { // > smallest to biggest < biggest to smallest
					int tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println();
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
		
		Arrays.sort(arr,evennum,arr.length);
		System.out.println();
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
		
		// 
		int counter =0;
    	int[] a= {12,0,7,0,8,0};
    	
    	for (int i=0;i<a.length;i++) {
    		if(a[i]!=0) {
    			a[counter]=a[i];
    			counter++;
    		}
    	}
    	
    	System.out.println(counter);
    	for(int i=counter;i<a.length;i++) {
    		a[i]=0;
    	}
 
    	System.out.println(Arrays.toString(a));

}}
