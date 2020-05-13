package collections.demo;

import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		Vector<String> vec= new Vector<String>(4);
		vec.add("Tiger");
		vec.add("cat");
		vec.add("deer");
		vec.add("Lion");
		System.out.println("Size of vector is: "+vec.size());
		System.out.println("Capacity of vector is "+vec.capacity());
		System.out.println("Elements of vectopr is "+vec);
		vec.addElement("zebra");
		vec.addElement("cheetah");
		vec.addElement("monkey");
		System.out.println("Size of vector is: "+vec.size());
		System.out.println("Capacity of vector is "+vec.capacity());
		if(vec.contains("Tiger")) {
			System.out.println("Tiger is in the index"+vec.indexOf("Tiger"));
		}
		else {
			System.out.println("Tiger is not in the list");
		}
		System.out.println("First animal of the vector is "+vec.firstElement());
		System.out.println("Last animal of the vector is "+vec.lastElement());

	}

}
