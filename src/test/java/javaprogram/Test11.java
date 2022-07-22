package javaprogram;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {12, 4,5,1,3, 7, 8,13,6};
		
		int l=0;
		int r=arr.length-1;
		int oddnum=0;
		while(l<r) {
			
			while(arr[l]%2!=0) {
				l++;
				oddnum++;
			}
			
			while(arr[r]%2==0 && l<r) {
				r--;
			}
			
			if(l<r) {
				int temp =arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
