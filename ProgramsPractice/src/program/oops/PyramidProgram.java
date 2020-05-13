package program.oops;

import java.util.Scanner;

public class PyramidProgram {

	public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter number of stars to be printed");
			int n= s.nextInt();
			int num=1;
//			for (int i=0;i<n;i++) {
//				for(int j=0;j<=n-1;j++) {
//					System.out.print("");
//				}
//				for(int k=0;k<=i;k++) {
//					System.out.print(k+" ");
//				}
//				System.out.println();
//			}
//			
//			for(int i=0;i<n;i++) {
//				for(int j=0;j<=i;j++) {
//					System.out.print("* ");
//					//num++;
//				}
//				System.out.println();
//			}
//			for(int i=0;i<=n;i++) {
//				for(int j=n;j>=i;j--) {
//					System.out.print("* ");
//					
//				}
//				System.out.println();
//			}
			
//			for(int i=0;i<n;i++) {
//				for(int j=2*(n-1);j<=i;j--) {
//					System.out.print(" ");
//				}
//				for(int j=0;j>=0;j++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
			
			for(int i=0;i<=(n+2);i++) {
				for(int j=(n+2);j>=i;j--) {
					if(((i+j)%2==0)){
						System.out.print("0 ");
					}else {
						System.out.print("1 ");
					}
				}
				System.out.print("\n");
			}


	}

}
