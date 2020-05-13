package program.oops;

import java.util.Scanner;

public class ArrayNumbers {

	public static void main(String[] args) {
		int odd=0;
		int even=0;
		int a[]= new int [20];
		System.out.println("Enter the numbers");
		Scanner s= new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			System.out.println(a[i]);
			if(a[i] % 2==0 ) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even numbers: "+even+"\nOdd numbers: "+odd);
		
	}
}

