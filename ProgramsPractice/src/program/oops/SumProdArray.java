package program.oops;

import java.util.Scanner;

public class SumProdArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the values ");
		int n= s.nextInt();
		int[] a= new int[n];
//		int sum=0;
//		int prod=1;
		int large=a[0];
		int small=a[0];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			System.out.println(a[i]);
//			sum=sum+a[i];
//			prod=prod*a[i];
		}
		for(int i=0;i<n;i++) {
			if(large<a[i]) {
				large=a[i];
			}if(small>a[i]){
				small=a[i];
			}
		}
//		System.out.println("Sum of the elements in array "+sum);
//		System.out.println("Product of the elements in array"+prod);
		System.out.println("Largest number is "+a[large]);
		System.out.println("Smallest number is "+a[small]);
	}

}
