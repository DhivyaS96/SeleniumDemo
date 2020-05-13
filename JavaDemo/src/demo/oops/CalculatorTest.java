package demo.oops;

public class CalculatorTest {                   //CLASS7 MAIN CLASS

	public static void main(String[] args) {     
		Cat cobj= new Cat(30,10);
		cobj.call();
		F fobj= new F(50.0,2.0);
		System.out.println(fobj.call());

	}
}
 class Apple{                                    //CLASS1
		int a;
		int b;
		public Apple(int a , int b) {            //CONSTRUCTOR1
			this.a= a;
			this.b= b;
		}
		public void calc() {                     //METHOD1
			System.out.println(a+b);
			
		}
	}
 class Ball extends Apple{                      //CLASS2
	 public Ball(int a, int b) {                //CONSTRUCTOR2
		 super(a,b);
		 this.a= a;
		 this.b= b;
	 }
	 public void calc() {                      //METHOD2
		 System.out.println(a-b);
		 super.calc();
	 }
 }
 class Cat extends Ball{                      //CLASS3
	 public Cat(int a, int b) {               //CONSTRUCTOR3
		 super(a,b);
	 }
	 public void call() {                     //METHOD3
		 calc();
	 }
 }
class D {                                    //CLASS4
	double c; 
	double d;
	public D(double c, double d) {                 //CONSTRUCTOR4
		this.c=c;
		this.d=d;
	}
	public double calc1() {                 //METHOD4
		return (c*d);
	}
}
class E extends D{                         //CLASS5
	public E(double c, double d) {               //CONSTRUCTOR5
		super(c,d);
		this.c=c;
		this.d= d;
	}
	public double calc1() {               //METHOD5
		System.out.println(super.calc1());
		return c/d;
	}
}
class F extends E{                       //CLASS6
	public F(double c, double d) {             //CONSTRUCTOR6
		super(c,d);
	}
	public double call() {                 //METHOD6
		return calc1();
	}
}

