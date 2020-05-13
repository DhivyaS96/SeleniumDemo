package abstractencapsule.oops;

public class Mul extends Calculator {
	
	public Mul() {
		System.out.println("Mul constructor invoked");
	}
	@Override
	double calc(double a, double b) {
		return super.getA()*super.getB();
	}
	@Override
	public String display() {
		return "Multiplication value is "+calc(super.getA(),super.getB());
	}
	
	

}
