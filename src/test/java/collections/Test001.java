package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("test");
		list.add("two");
		list.add(null);
		list.add(null);

		list.set(0, "test1");
		list.remove(1);
		for(String li:list) {
			System.out.println(li);
		}
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.addFirst("test1");
		list1.addLast("test2");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();  

		lhs.add(null);
		lhs.add(null);
		
		for(String lh:lhs) {
			System.out.println(lh);
		}
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("satheesh", "email1");
		map.put("satheesh", "emial1");
		map.put("satheesh1", "emial1");
		
		System.out.println(map.entrySet());
		

	}

}
