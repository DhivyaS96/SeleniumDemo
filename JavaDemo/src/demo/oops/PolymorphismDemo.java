package demo.oops;

public class PolymorphismDemo {
	
	//SAME METHOD NAME WITH DIFFERENT ARGUMENT 

//	public void car(int wheel1, int wheel2) {
//		System.out.println(wheel1+wheel2);
//	}
//	public void car(String Engine) {
//		System.out.println(Engine);
//	}
//	public void car() {
//		System.out.println("car");
//	}
//	public static void main(String[] args) {
//		PolymorphismDemo poly = new PolymorphismDemo();
//		poly.car();
//		poly.car("Range Rover");
//		poly.car(4,5);
//	}
	
	//OVERLOADING
	
	public int car(int wheel1, int wheel2) {
		return(wheel1+wheel2);
	}
	public String car(String engine) {
		return engine;
	}
	public void car() {
		System.out.println("car");
	}
	public static void main(String[] args) {
		PolymorphismDemo poly1= new PolymorphismDemo();		
		System.out.println((poly1.car(5,6)));
		System.out.println((poly1.car("Range Rover")));
		poly1.car();
	}
}
