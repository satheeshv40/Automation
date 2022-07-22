package javaprogram;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** 1) Program to Reverse Number */

		int number = 98754, reverse = 0;
		while (number != 0) {
			int reminder = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + reminder;

		}
		
		

		/**
		 * Itreation 1 number = 98754 reminder = 4 number = 9875 reverse = 4
		 * 
		 * Itreation 2 number = 9875 reminder = 5 number = 987 reverse = 4*10+5 = 45
		 * 
		 * Itreation 3
		 * 
		 * number = 987 reminder = 7 number = 98 reverse - 45*10+7 = 457
		 * 
		 * itreation 4
		 * 
		 * number = 98 reminder = 8 number = 9 reverse = 457*10+8 = 4578
		 * 
		 * itreation 5
		 * 
		 * number = 9 reminder = 9 number =0 reverse = 4578*10 + 9 = 45789
		 * 
		 */
		System.out.println(reverse);

		
		
		/** 2) To Check whether entered number is positive or negative */
		// 1st Normal Method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Number is Poisitive");
		} else if (num < 0) {
			System.out.println("Number is Negative");

		} else {
			System.out.println("Number is Zero");
		}

		// 2nd signNum Method - sign num retruns 1 for arguments >0, -1 for arguments
		// <0, and 0 for arguments=0

		System.out.println("Enter Input Number");
		int num1 = sc.nextInt();
		System.out.println(Integer.signum(num1));

		/** 3) Find the even numbers from 1 to 100 */

		int num2 = 100;
		for (int i = 0; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				// System.out.print(i+"-");
			}

		}
		System.out.println();

		/** 4) Swap of two number */

		int swapa = 15;
		int swapb = 30;
		System.out.println("Before Swapping " + swapa + " - " + swapb);
		swapa = swapa + swapb;
		swapb = swapa - swapb;
		swapa = swapa - swapb;
		System.out.println("After  Swapping " + swapa + " - " + swapb);

		/** 5) Find Largest Number */

		int[] largest = { 1, 34, 67, 4, 56, 78, 4, 69, 75, 5, 75 };

		int max = largest[0];
		for (int i = 0; i < largest.length; i++) {
			if (largest[i] > max) {
				max = largest[i];
				System.out.println(max);
			}
		}

		System.out.println("The Largest Number -> " + max);

		/** 6) Find smallest Number */

		int[] smallest = { 34, 67, 4, 56, 78, 4, 69, 75, 5, 75 };

		int min = smallest[0];
		for (int i = 0; i < smallest.length; i++) {
			if (smallest[i] < min) {
				min = smallest[i];
			}
		}

		System.out.println("The smallest Number -> " + min);

		/** 7) Ascending order */

		int arr1[] = { 12, 34, 56, 1, 789, 45 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}

		System.out.println("Ascending Order is --> " + arr1);
		for (int arr : arr1) {
			System.out.print(arr + " ");
		}

		System.out.println(arr1.length - 2);

		/** 8) Find the largest number between three numbers */

		int number1 = 987;
		int number2 = 456;
		int number3 = 231;

		if (number1 > number2 && number1 > number3) {
			System.out.println("The Biggest Number is " + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("The Biggest Number is " + number1);
		} else if (number3 > number1 && number3 > number2) {
			System.out.println("The Biggest Number is " + number1);
		} else {
			System.out.println("Numbers are same");
		}

		/** 9) First Non repitive index in a string */

		// 1st Method
		String str = "teetera";

		for (char str1 : str.toCharArray()) {
			System.out.println(str.indexOf(str1));
			System.out.println(str.lastIndexOf(str1));
			if (str.indexOf(str1) == str.lastIndexOf(str1)) {
				System.out.println("First Non repeating index --> " + str1);
			}
		}

		// 2nd Method

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
			if (entry.getValue() == 1)
				System.out.println("non repetaive " +entry.getKey());
			// entry.getKey();
		}
		
		/** Union of two arrays */
		
		int arr2[] = { 1, 2, 2, 2, 3 };
        int arr3[] = { 2, 3, 3, 4, 5, 5 };

        //TreeSet<Integer> set = new TreeSet<>();
		Set<Integer> set = new HashSet<Integer>();

        for(int i:arr2) {
        	set.add(i);
        }
        for(int i:arr3) {
        	set.add(i);
        }
        
        System.out.println("Set "+set);
        
        /** Missing Number */
        int arr4[] = { 1,2,4,5,6 };
        System.out.println(arr4.length);
        int n=arr4.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr4.length; i++) {
            restSum+=arr4[i];
        }
        int missingNumber=sum-restSum;
        
        System.out.println("Missing Value --> "+missingNumber);
        
        /** Fibonacci Sereies */
        
        int n1=
        		
        		 0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for (int i=2;i<10;i++) {
        	n3=n1+n2;
        	System.out.print(" "+n3);
        	n1=n2;
        	n2=n3;
          }

        System.out.println();
        
        
        /** Prime Number */
        
        int n4=11, flag=0;
        int m=n4/2;
        
        if(n4==0 || n4==1) {
        	System.out.println("Entered Number is not a prime number");
        }else {
        	for(int i=2; i<=m;i++) {
        		if (n4%i==0) {
        			System.out.println("Entered Number is not a prime number");
        			flag=1;
        			break;
        		}
        	}
        	if(flag==0) {
        		System.out.println("Entered Number is Prime Number");
        	}
        }
        
        
        /** Palindrome */
        
        int numb = 454, revers = 0;
        int temp=numb;
		while (numb != 0) {
			int reminder1 = numb % 10;
			numb = numb / 10;
			revers = (revers * 10) + reminder1;

		}
		
		if(temp==revers) {
			System.out.println("Yes Palindrome");
		}
        
		/** Factorial */
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact = fact*i;
		}
		System.out.println("Fatcorial of 5 --> "+ fact);
	}

}
