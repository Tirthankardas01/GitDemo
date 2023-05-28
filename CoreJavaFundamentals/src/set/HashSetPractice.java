package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {

		//1. add
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		System.out.println("Elements of hashset are "+hs);
		
		//2. clear
		hs.clear();
		System.out.println("Elements of hashset upon calling clear method are "+hs);
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		//3. contains
		System.out.println("Contains method on hashset "+hs.contains(4));
		
		//4. remove
		hs.remove(4);
		System.out.println("Remove method "+hs);
		
		
	}

}
