package collections.demo;

import java.util.Vector;

public class VecAnimals {

	public static void main(String[] args) {
		Vector<String> vec= new Vector<String>() ;
		vec.add("Tiger");
		vec.add("Cat");
		vec.add("Lion");
		System.out.println("Size of the vector is: "+vec.size());
		System.out.println("Capacity of the vector is: "+vec.capacity());
		vec.addElement("Deer");
		vec.addElement("Elephant");
		System.out.println("Elements in vector are: "+vec);
		System.out.println("Size of vector after adding element: "+vec.size());
		System.out.println("Capacity of vector after adding element: "+vec.capacity());
		System.out.println("First elementy of vector is: "+vec.firstElement());
		System.out.println("Last elementy of vector is: "+vec.lastElement());
		if(vec.contains("Tiger")) {
			System.out.println("Vector contains Tiger in the index "+vec.indexOf("Tiger"));
		}else {
			System.out.println("Tiger not present in the vector");
		}

	}

}
