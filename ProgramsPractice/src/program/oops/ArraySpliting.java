package program.oops;

import java.util.Scanner;

public class ArraySpliting {

	public static void main(String[] args) {
		System.out.println("Enter number of elements in array:");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int a[]= new int [n];
		int i,j=0;
		int b[]= new int [n];
		for(i= 0;i<n/2;i++) {
				a[i]= s.nextInt();
				System.out.println("The first array is a["+a[i]+"]:"+a[i]);
			}
		
		for(j=n/2;j<n;j++) {
			b[j]= s.nextInt();
			System.out.println("The Second array is a["+b[j]+"]:"+b[j]);
		}
		

	}

}
