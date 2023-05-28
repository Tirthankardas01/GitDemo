package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Aman");
		map.put(2, "Binay");
		map.put(3, "Chandan");
		map.put(4, "Dharam");
		
		System.out.println(map);
		
		map.put(4, "Daman");
		
		System.out.println(map);
		
		map.remove(4);
		
		System.out.println(map);
		
		for(Map.Entry me : map.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		
		
	}

}
