package program.oops;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= new int[10];
		int b[]= new int[10];
		System.out.println("Enter the values of array");
		Scanner s= new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			System.out.println(a[i]);
		}
		int j=0;
		for(int i=b.length-1;i>=0;i--) {
			b[i]=a[j];
			j++;
		}
		System.out.println("Reverse array:");
		for(int i =0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
