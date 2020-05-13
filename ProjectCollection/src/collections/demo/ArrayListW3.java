package collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListW3 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Black");
		list.add("Pink");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		System.out.println("List of elements added are: "+list);
		
		//Iterate through all the elements in array
		for(String l : list) {
			System.out.println("List of colours are: "+l);
		}
		
		// insert an element into the array list at the first position
		list.add(0, "Purple");
		System.out.println("Insert element at first position :"+list);
		
		//retrieve an element (at a specified index) from a given array list
		System.out.println("Retrieve element at index 3 is: "+list.get(3));
		
		//update specific array element by given element
		list.set(2, "White");
		System.out.println("Update the array element 2 to white"+list);
		
		//remove the third element from a array list
		list.remove(2);
		System.out.println("remove the third element from a array list"+list);
		
		// search an element in a array list
		if(list.contains("Black")) {
			System.out.println("Index of black is "+list.indexOf("Black"));
		}
		else {
			System.out.println("Black not present in array");
		}
		
		//sort a given array list
		Collections.sort(list);
		System.out.println("Sorted list is "+list);
		
		//copy one array list into another
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("Dhivya");
		list1.add("Elsa");
		list1.add("Vanshi");
		list1.add("Jeevi");
		list1.add("Sowmya");
		System.out.println("List1: "+list1);
		
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		System.out.println("List2: "+list2);
		
		Collections.copy(list2, list1);
		System.out.println("Copied from: "+list1);
		System.out.println("Copied to: "+list2);
		
		
		//shuffle elements in a array list
		Collections.shuffle(list2);
		System.out.println("Shuffled list is"+list2);
		
		//reverse elements in a array list
		Collections.reverse(list);
		System.out.println("Reverse of list of colors"+list);
		
		//extract a portion of a array list
		List<String> sublist= list.subList(0, 4);
		System.out.println("Extracted portion of array is "+sublist);
		
		//compare two array lists
		boolean val= list1.equals(list2);
		System.out.println("Compare list1 and list2: "+val);
		
		//swap two elements in an array list
		Collections.swap(list, 0, 2);
		System.out.println("Swapped elements in list is: "+list);
		
		//join two array lists
		list.addAll(list2);
		System.out.println("Join two array list : "+list);
		
		//clone an array list to another array list
		ArrayList<String> list4= (ArrayList<String>)list.clone();
		System.out.println("Cloned array list4 is "+list4);
		
		//empty an array list
		list4.removeAll(list4);
		System.out.println("Emptied list4 is "+list4);
		
		//test an array list is empty or not
		if(list4.isEmpty()) {
			System.out.println("List4 is empty"+list4);
		}else {
			System.out.println("List4 is not empty"+list4);
		}
		
		//trim the capacity of an array list the current list size
		list2.trimToSize();
		System.out.println("Trim to size of current arraylist "+list2);
		
		//increase the size of an array list
		System.out.println("Size of list2 is: "+list2.size());
		list2.ensureCapacity(6);
		list2.add("Geetha");
		System.out.println("After increasing the size of list2 is: "+list2.size());

		}

	}


