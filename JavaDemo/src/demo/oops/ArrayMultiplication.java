package demo.oops;

import java.util.Scanner;

public class ArrayMultiplication {
	public static void main(String[] args) {
		
		int m,n,p,q,sum=0,c,d,r,s,k;
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of rows and coloums for first matrix");
		m = in.nextInt();
	    n = in.nextInt();
		int first[][]= new int[m][n];
		
		System.out.println("Enter the elemnts of matrix");
		for(c=0;c<m;c++) {
			for(d=0;d<n;d++) {
				first[c][d]= in.nextInt();
			}
		}
		
		System.out.println("Enter the number of rows and coloums for second matrix");
		p=in.nextInt();
		q=in.nextInt();
		if(n!=p) {
			System.out.println("Matrix multiplication is not possible");
		}else {
			int second[][]= new int [p][q];
			int multiply[][]= new int [m][q];
			System.out.println("Enter the elements of the matrix");
			for(c=0;c<p;c++) {
				for(d=0;d<n;d++) {
					second[c][d]=in.nextInt();
					
					for(c=0;c<m;c++) {
						for(d=0;d<q;d++) {
							for(k=0;k<p;k++) {
								sum= sum+first[c][k]*second[k][d];
								System.out.println(sum+"");
								
								multiply[c][d]=sum;
								sum=0;
							}
						}
						System.out.println("Product of the matrix is ");
						for(c=0;c<m;c++) {
							for(d=0;d<q;d++) {
								multiply[c][d]= sum;
								System.out.println( );
							}
						}
					}
				}
			}
			
		}
		
	}
	
}
