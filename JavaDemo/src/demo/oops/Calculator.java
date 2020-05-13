package demo.oops;

public class Calculator {
		public static void main(String[] args) {
			C cobj= new C(30,10);
			System.out.println(cobj.call());
		}
}
class A{
	int a;
	int b;
	public A(int a, int b){
		this.a= a;
		this.b= b;
		}
	public void calc() {
		System.out.println(a+b);
	}
	
}
class B extends A{
	public B(int c, int d) {
		super(c,d);
		this.a= c;
		this.b=d;
	}
	public void calc() {
		super.calc();
		System.out.println(a-b);
	}
}
class C extends B{
	public C(int c, int d) {
		super(c,d);
	}
	public String call() {
		calc();
		return "dhivya";
		
		
	}
}
		
