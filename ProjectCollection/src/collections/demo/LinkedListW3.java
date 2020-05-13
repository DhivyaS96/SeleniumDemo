package collections.demo;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListW3 {

	public static void main(String[] args) {
		
		//append the specified element to the end of a linked list
		LinkedList<String> list= new LinkedList<String>();
		list.add("Dhivya");
		list.add("Elsa");
		list.add("Vanshi");
		list.add("Geetha");
		System.out.println("List is : "+list);
		
		//iterate through all elements in a linked list
		for(String e: list) {
			System.out.println(e);
		}
		
		//iterate through all elements in a linked list starting at the specified position
		System.out.println("Element from specified position is");
		Iterator itr= list.listIterator(2);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//iterate a linked list in reverse order
		System.out.println("Elements in reverse order :");
		Iterator p= list.descendingIterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		//insert the specified element at the specified position in the linked list
		list.add(1, "Bently");
		System.out.println("List after adding element at specified position is: "+list);
		
		//insert elements into the linked list at the first and last position
		list.addFirst("Lamborghini");
		list.addLast("Porche");
		System.out.println("Elements added at first and last position are: "+list);
		
		//insert the specified element at the front and last of a linked list
		list.offerFirst("Range Rover");
		list.offerLast("Massarati");
		System.out.println("Element added at the front and last of the linked list is: "+list);
		
		
		//insert some elements at the specified position into a linked list
		LinkedList<String> list2= new LinkedList<String>();
		list2.add("Hundai");
		list2.add("Honda");
		list.addAll(2, list2);
		System.out.println("One list of elements copied into another list at specified position: "+list);
		

	}

}
