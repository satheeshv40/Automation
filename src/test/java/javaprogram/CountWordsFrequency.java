package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountWordsFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentences ="New All is good All is well Everything is good Everthying is well";
		String[] word =sentences.split(" ");
		for (String str:word) {
			System.out.println(str);
		}

		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<word.length;i++) {
			if(map.containsKey(word[i])) {
				int count = map.get(word[i]);
				map.put(word[i], count+1);
			}else{
				map.put(word[i], 1);
			}
			
		}
		
		System.out.println(map.entrySet());
		
		for(Entry<String, Integer> entry: map.entrySet()) {
		System.out.println("Key --> "+ entry.getKey() +" value --> "+ entry.getValue() );
		}
		
	}

	
	
}
