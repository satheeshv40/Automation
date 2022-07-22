package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountlettersFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="NewAllisgoodAlliswellEverythingisgoodEverthyingiswell";
		

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), count+1);
			}else{
				map.put(str.charAt(i), 1);
			}
			
			
		}
		
		System.out.println(map.entrySet());
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
		System.out.println("Key --> "+ entry.getKey() +" value --> "+ entry.getValue() );
		}
		
	}

	
	
}
