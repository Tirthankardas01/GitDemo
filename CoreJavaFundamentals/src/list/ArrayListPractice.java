package list;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

		//ArrayList Methods
		//1. add(object) and add(int index, Object)
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(0);
		ar.add(2);
		ar.add(1, 1);
		
		System.out.println("Elements of arraylist are "+ar);
		
		//2. set() method - to chnage an element by its index
		ar.set(0, -1);
		System.out.println("Elements of arraylist after set () method "+ar);
		
		//3. remove(object) and remove(int index)
		ar.remove(2);
		ar.remove(0);
		
		System.out.println("Elements of arraylist after using remove methods "+ar);
		
		ar.add(1, 2);
		ar.add(2, 3);
		ar.add(3, 4);
		
		//4. Iterating the arraylist using simple for loop
		for (int i=0; i<ar.size(); i++) {
			System.out.print(ar.get(i)+" ");
		}
		
		System.out.println();
		
		//5. Iterating the arraylist using for each loop
		for(Integer i: ar) {
			System.out.print(i+ " ");
		}
		
		
	}

}
