package javaprogram;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class StringReverese {

	
	public static void main(String[] args) {
		
		String txt= "Welcome to Java programing";
		String[] arr= txt.split(" ");
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
			System.out.println("--> "+arr[i]);
		}
	
		System.out.println();
		Collections.reverse(list);
		
		for(String li:list) {
			System.out.print(li+" ");
		}
		
	
		LinkedHashMap<String, Integer> map= new LinkedHashMap<>();
		

	}
}
