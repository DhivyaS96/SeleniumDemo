package collections.demo;

import java.util.TreeMap;

public class TreemapDemo {
	static void ExamplConstructor() {
		TreeMap<Integer,String> tree= new TreeMap<Integer,String>();
		tree.put(234, "Geeks");
		tree.put(121, "For");
		tree.put(543, "Geeks");
		tree.put(90, "Great");
		
		System.out.println("Treemap:"+tree);
	}

	public static void main(String[] args) {
		System.out.println("Treemap called using Treemap constructor");
		ExamplConstructor();

	}

}
