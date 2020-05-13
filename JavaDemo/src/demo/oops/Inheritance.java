package demo.oops;

public class Inheritance {
	
	public static void main (String args[]) {

		Child childobj = new Child(40,30);
		childobj.child1();
		childobj.display();
		Grandchild grandchildobj= new Grandchild(20,10);
		//grandchildobj.child1();
		grandchildobj.child1();
		grandchildobj.grandchild1();
		grandchildobj.display();
		
		

	}

}

 class Parent{                        //PARENT CLASS
	 int a;
	 int b;
	
	 public Parent(int a, int b){	//PARAMETRIZED CONSTRUCTOR
		 
		 this.a= a;
		 this.b= b;
	 }
	public void child1() {           //METHOD
		System.out.println(a+b);
		System.out.println("Parent message");
	}
 }
 
 class Child extends Parent{ 
	
	 public Child(int a, int b) {
		super(a, b);
		this.a= a;
		this.b=b;
	}
	 public void child1() {     //CHLID CLASS
		 System.out.println(a-b);
		
	 }
	 public void display() {
		 System.out.println("child message");
		 child1();
		 super.child1();
	 }
 }
 class Grandchild extends Child{
	 
	 public Grandchild(int c, int d) {
		 super(c,d);
		 this.a = c;
		 this.b= d;
		 
	 }
	 public void grandchild1() {
		 System.out.println(a*b);
	 }
	 public void display() {
		 System.out.println("grandchild message");
		 System.out.println(super.a+" "+super.b);
	 }
 }
 