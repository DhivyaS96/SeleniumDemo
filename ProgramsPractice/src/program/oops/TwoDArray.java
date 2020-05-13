package program.oops;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int row,col;
		int a[][]= new int[5][5];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row= s.nextInt();
		System.out.println("Enter the nbumber of coloumn");
		col= s.nextInt();
		System.out.println("Enter the values for 2D matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
