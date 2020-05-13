package program.oops;

import java.util.Scanner;

public class AvgNumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n=s.nextInt();
		int sum=0;
		int div=0;
		for(int i=0;i<n;i++) {
			sum=sum+s.nextInt();
			div=sum/2;
		}
		System.out.println("Sum is"+sum);
		System.out.println("Avg of sum is"+div);
	}

}
