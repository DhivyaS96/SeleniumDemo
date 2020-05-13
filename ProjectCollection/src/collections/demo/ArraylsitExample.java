package collections.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylsitExample {

	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("black");
		list.add(0, "pink");
		System.out.println(list.set(0, "Rose gold"));
		System.out.println("Print the lsit"+list);
		for (String s : list) {
			System.out.println(s);

		}
		System.out.println("Retrieve element in 2nd index:"+list.get(2));
		list.remove(3);
		System.out.println("Remove third element :"+list);
		
		if(list.contains("Rose gold")) {
			System.out.println("Element found in the list in the index"+list.indexOf("Rose gold"));
		}else {
			System.out.println("Element not found");
		}
		
		Collections.sort(list);
		System.out.println("Sorted list :"+list);
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("pink");
		list2.add("yellow");
		list2.add("orange");
		Collections.copy(list2, list);
		System.out.println("Copied first list to a new list :"+list2 );
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled list is:"+list);
		
		Collections.reverse(list2);
		System.out.println("Reversed list:"+list2);
		
		Collections.swap(list, 2, 0);
		System.out.println("Swapped list :"+list);
		
		list.removeAll(list);
		System.out.println("Removed entire set:"+list);
	}

}
