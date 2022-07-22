package javaprogram;

public class ArrayShiftingAndSegeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 0, 1, 1, 0, 0, 0 };
		int size = arr.length;
		System.out.println("Array Size" + size);
		System.out.print("Original Array --> ");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		/* Number of times the array to be repeated */

		int n = 3;
		for (int i = 0; i < n; i++) {
			int j, last;
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}

			arr[0] = last;
		}

		System.out.println();

		// Displays resulting array after rotation
		System.out.println("Array after right rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		/*
		 * Method 1 - Counting the number of zeros and assign travesere the loop and
		 * fill the value of Zero and with the remaining fill iwth 1
		 */

		int[] arr1 = { 1, 0, 1, 1, 0, 0, 0 };
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				count++;
			}
		}

		System.out.println("The Number of Zeros are " + count);

		for (int i = 0; i < count; i++) {
			arr1[i] = 0;
		}

		for (int i = count; i < arr1.length; i++) {
			arr1[i] = 1;
		}

		System.out.println("Array after Segeration: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		/* 2nd Method */
		int[] arr2 = { 1, 1, 1, 0, 0, 0, 1, 0 };
		int left = 0;

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == 0) {

				int temp = arr2[left];
				arr2[left] = arr2[i]; // arr2[0]==arr2[3] -- arr2[1]==arr2[4]
				arr2[i] = temp; // arr2[3]==arr2[0] -- arr2[4]==arr2[1]
				++left; // left = 1
				System.out.println("-- " + left);
			} 
			
		}

		System.out.println("Array after Segeration: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
