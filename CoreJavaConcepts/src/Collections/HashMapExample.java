package Collections;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("chamu", 90);
		map.put("john", 60);
		map.put("roy", 80);
		
		Set<String> keySet = map.keySet();
		System.out.println("keys: "+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("values: "+values);
		
		for(String key : keySet) {
			System.out.println("Key: "+key+" Value: "+map.get(key));
		}
	}

}
