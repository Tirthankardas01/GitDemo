package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		//1. add
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		
		System.out.println("Elements of treeset are "+ts);
		
		//2. addall
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(7);
		ts1.add(8);
		ts1.add(9);
		ts1.add(10);
		
		ts.addAll(ts1);
		System.out.println("Elements of ts after invoking addall method "+ts);
		
		//3. ceiling
		System.out.println("Using ceiling method "+ts.ceiling(4));
		
		//4. clone
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		ts2 = (TreeSet)ts1.clone();
		System.out.println("Using clone method on ts2 "+ts2);
		
		//5. contains
		System.out.println("Using contains method on ts "+ts.contains(12));
		
		//6. Descending iterator
		Iterator<Integer> itr = ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		
		//7. descendingset
		System.out.println("Using descendingset method "+ts.descendingSet());
		
		//8. first
		System.out.println("Using first method "+ts.first());
		
		//9. floor
		System.out.println("Using floor method "+ts.floor(12));
		
		//10. headset
		System.out.println("Using headset method "+ts.headSet(7));
		
		//11. tailset
		System.out.println("Using tailset method "+ts.tailSet(8));
	}
	

}
