package collections.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathSet {

	public static void main(String[] args) {
		Set<Integer> hashset= new HashSet<Integer>();
		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		hashset.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,10,11,12,13}));
		Set<Integer> b= new HashSet<Integer>();
		b.addAll(Arrays.asList(arr));
		
		//Union
		Set<Integer> union= new HashSet<Integer>(hashset);
		union.addAll(b);
		System.out.println("Union of set is: ");
		System.out.println(union);
		
		//Intersection
		Set<Integer> intersection = new HashSet<Integer>(hashset);
		intersection.retainAll(b);
		System.out.println("Intersection of set is: ");
		System.out.println(intersection);
		
		//Difference
		Set<Integer> difference= new HashSet<Integer>(hashset);
		difference.removeAll(b);
		System.out.println("Difference of set is: ");
		System.out.println(difference);

	}

}
