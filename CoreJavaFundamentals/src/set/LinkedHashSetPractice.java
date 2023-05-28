package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {

	public static void main(String[] args) {

		Set<Integer> lhs = new LinkedHashSet<Integer>();
		
		//1. add
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		
		System.out.println("Elements of linkedhashset are "+lhs);
		
		//2. remove
		lhs.remove(1);
		System.out.println("New elements of lhs are "+lhs);
		
		//3. Iteration using iterator
		Iterator<Integer> itr = lhs.iterator();	
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		
		//4. Iteration using enhanced For loop
		for(int e:lhs) {
			System.out.print(e+" ");
		}
		
		
		
	}

}
