package program.oops;

import java.util.Scanner;

public class AreaClass {

	public static void main(String[] args) {
		System.out.println("Enter length and breath: ");
		Scanner s= new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		AreaClass a= new AreaClass(l, b);
		System.out.println("Area of rect"+a.returnArea());
		System.out.println("perimeter of rect"+a.returnPreimeter());

	}
	int l,b;
	public AreaClass(int l,int b) {
		this.l=l;
		this.b=b;
	}
	public double returnArea(){
		return l*b;
	}
	public double returnPreimeter() {
		return 2*(l+b);
	}

}
