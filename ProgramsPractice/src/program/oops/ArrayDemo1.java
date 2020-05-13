package program.oops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int a[]= new int[10];
		System.out.println("Enter 10 values for array");
		Scanner s= new Scanner(System.in);
		for(int i=0;i<10;i++) {
			a[i]=s.nextInt(); 
			
		}
		for(int i=0;i<10;i++) {
		System.out.println("The values of array are: "+a[i]);
		}
		System.out.println("Give a number: ");
		int x= s.nextInt();
		
		boolean bool = false; // false
		
		for (int i : a) {  	// check for elements
			if(x==i) {			// match the elements 
				bool = true;    // wont execute if not matched
			}
		}
		
		if(bool) {				// only execute if value is true
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		
	}
	
	

}
