package javaprogram;
 
import java.util.Arrays;
public class MissingNumber {
 
    public static void main(String[] args) {
    	
    	
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
    	
        int[] arr1={7,5,6,4,2,5,5,4};
        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
        int[] arr2={5,3,1,2};
        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
 
    }
 
    public static int missingNumber(int[] arr)
    {

        int n=arr.length+1;
        System.out.println("n value is "+n );
        int sum=n*(n+1)/2;
        System.out.println("sum value is "+ sum);
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
            System.out.println("--> " +restSum);
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}