package program.oops;

public class ClassMethodDem {

	public static void main(String[] args) {
		A a= new B();
		a.printing();
		B b = new B();
		b.printing();

	}
	static class A{
		public static void printing() {
			System.out.println("parent");
		}
	}
	static class B extends A{
		public static void printing() {
			System.out.println("Child");
		}
	}

}
