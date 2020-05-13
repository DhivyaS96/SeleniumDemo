package program.oops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= s.nextInt();
		int var=1;
		//int fact=1;
		for(int i=n;i>=1;i--) {
			//fact= fact*i;
			var=var*i;
			
		}
		System.out.println(var);
	}

}
