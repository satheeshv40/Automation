package javaprogram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		
		// returns the set of key and values
		System.out.println(map.entrySet());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
	
		for(Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() +"" + entry.getValue());
		}
		
		List<String> key = new ArrayList<String>(map.keySet());
		for (String ke:key) {
			System.out.println(ke);
		}
		
		
		List<Integer> value = new ArrayList<>(map.values());
		System.out.println(value);
		for (int i:value) {
			System.out.println(i);
		}
		
	}

}
