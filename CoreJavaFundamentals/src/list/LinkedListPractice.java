package list;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

		//1. add
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Amit");
		ll.add("Alok");
		ll.add("Aman");
		ll.add("Barun");
		ll.add("Badal");
		ll.add("Chayan");
		ll.add("Das");
		ll.add(7, "Daman");
		System.out.println("Elements of linkedlist are "+ll);
		
		//2. addAll
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Raju");
		ll1.add("Sourav");
		ll.addAll(ll1);
		System.out.println("Elements of linkedlist 1 after adding elements of linkedlist 2 are "+ll);
		
		//3. clear
//		ll.clear();
//		System.out.println(ll);
		
		//4. addfirst
		ll.addFirst("Abhishek");
		System.out.println("Elements of ll after using addfirst "+ll);
		
		//5. addlast
		ll.addLast("Gaurav");
		System.out.println("Elements of ll after using addlast "+ll);
		
		//6. Element
		System.out.println("After invoking Element method "+ll.element());
		
		//7. Peek
		System.out.println("After invoking Peek method "+ll.peek());
		
		//8. PeekFirst
		System.out.println("After invoking Peekfirst method "+ll.peekFirst());
		
		//9. peeklast
		System.out.println("After invoking Peeklast method "+ll.peekLast());
		
		//10. PollFirst
		ll.pollFirst();
		System.out.println("After invoking PollFirst method "+ll);
		
		//11. PollLast
		ll.pollLast();
		System.out.println("After invoking PollLast method "+ll);
		
	}

}
