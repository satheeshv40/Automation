package javaprogram;

import java.util.HashMap;
import java.util.Map;

public class FindingDuplicateAndFrequecyOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** Find the duplicate numbers */

		int[] numbers = { 1, 5, 3, 6, 1, 9, 6, 9, 4, 3, 1 };

		for (int i = 0; i <= numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.print(numbers[i] + " ");
				}
			}
		}

		/** count the frequency of number in an array */

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			if (mp.containsKey(numbers[i])) {
				int count = mp.get(numbers[i]);
				mp.put(numbers[i], count + 1);
			} else {
				mp.put(numbers[i], 1);
			}

		}
		System.out.println(mp);

		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println("The Number " + entry.getKey() + " and its repeated Count is --> " + entry.getValue());

		}
		
		int i=346334;
		

	}
}
