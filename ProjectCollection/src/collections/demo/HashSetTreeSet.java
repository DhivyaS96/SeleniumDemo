package collections.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSet {

	public static void main(String[] args) {
		Set<String> hashset= new HashSet<String>();
		hashset.add("Geeks");
		hashset.add("for");
		hashset.add("Geeks");
		hashset.add("is");
		hashset.add("good");
		System.out.println("Hashset without duplicates");
		System.out.println(hashset);
		
		Set<String> treeset= new TreeSet<String>(hashset);
		System.out.println("Sorted order of treeset is: ");
		System.out.println(treeset);

	}

}
