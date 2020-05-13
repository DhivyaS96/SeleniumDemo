package program.oops;

import java.util.Scanner;

public class ArrayDiff {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int a[]= new int[n];
		int max=a[0];
		int min= a[0];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
			
		}
		for(int i=0;i<n;i++) {
				if(max<a[i]) {
				max=a[i];
			}
				
		}
		System.out.println("Maximum value in array is:"+max);
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					min=a[i];
					a[i]=a[j];
					a[j]=min;
				}
			}
			
		}
		System.out.println("Minimum value of array is"+a[0]);
		

	}
		

}
