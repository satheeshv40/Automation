package javaprogram;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class NumberProgramsrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		int na = 10;
		int nat = na * (na + 1) / 2;
		System.out.println(nat);
		char c = 'a';
		char d = 'a';
		int value = (int) c;
		int value1 = d;

		System.out.println(value);
		System.out.println(value1);

		Random random = new Random();
		System.out.println(random.nextInt(5));
		/* reverse and palindrome */
		System.out.println(ThreadLocalRandom.current().nextInt());

		int number = 5455, reverse = 0;
		System.out.println("Original Number is " + number);

		int tmp = number;
		while (number != 0) {
			int reminder = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + reminder;
		}
		System.out.println("Reversed Number is " + reverse);
		if (tmp == reverse) {
			System.out.println("Entered Number is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		/* Even and odd Number */

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 || i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		/* swap */
		int a = 10;
		int b = 5;
		System.out.println("Before Swapping " + a + " - " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping " + a + " - " + b);

		/* smallest number */
		int[] smallest = { 34, 67, 4, 56, 78, 4, 69, 75, 5, 75 };
		int min = smallest[0];
		for (int i = 0; i < smallest.length; i++) {
			if (smallest[i] < min) {
				min = smallest[i];
			}
		}

		int[] arr = { 34, 67, 4, 56, 78, 4, 69, 75, 5, 75 };

		System.out.println("The Minimum value is " + min);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}

		System.out.println(Arrays.toString(arr));

		System.out.println(arr[arr.length - 2]);

		// fibo
		int n1 = 0;
		int n2 = 1;

		for (int i = 2; i < 10; i++) {
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}

		// prime

		int n = 17; // number to be checked
		int m = n / 2;
		int flag = 0;
		if (n == 0 || n == 1) {
			System.out.println("not a primenuber");
		} else {
			for (int i = 2; i < m; i++) {
				if (n % i == 0) {
					System.out.println("not a prime number");
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println("Prime Number");
			}
		}

		// fact
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println("fact " + fact);
	}

}
