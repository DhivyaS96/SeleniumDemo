package collections.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AscEvenSet {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int var=0;
		System.out.println("Enter the number of elements in set: ");
		Set<Integer> hashset= new HashSet<Integer>();
		int n= s.nextInt();
		for(int i=0;i<n;i++) {
			var= s.nextInt();
			hashset.add(var);
		}
		
		System.out.println("Elements in the hashset are: ");
		System.out.println(hashset);
		
		Set<Integer> treeset= new TreeSet<Integer>(hashset);
		System.out.println("Sorted Treeset elements are: ");
		System.out.println(treeset);
		
		Set<Integer> remove= new TreeSet<Integer>(treeset);
		System.out.println("Odd numbers removed from treeset are:");
		for (Integer odd : remove) {
			if(odd%2!=0) {
				
				treeset.remove(odd); // remove odd numbers
			}
		}
		System.out.println(treeset); // print the even numbers
		
		
	}

}


