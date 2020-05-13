package program.oops;

import java.util.Scanner;

public class ArrayFrontBack {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter number of elements in array");
		int n= s.nextInt();
		int a[]= new int[n];
		int j= n-1;
		boolean read= true;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			System.out.println("The value of a["+a[i]+"]"+a[i]);
			
		}
		for(int i=0;i<n/2;i++) {
			if(a[i]!=a[j]) {
				read= false;
				break;
			}
			else {
				j--;
			}
			System.out.println(read);
		}
		
		

	}

}
