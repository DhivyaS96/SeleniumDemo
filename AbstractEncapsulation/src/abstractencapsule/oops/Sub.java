package abstractencapsule.oops;

public class Sub extends Calculator {
	
	public Sub() {
		System.out.println("Sub constructor invoked");
	}

	@Override
	double calc(double a, double b) {
		return super.getA()-super.getB();
	}

	@Override
	public String display() {
		return "Subraction value is "+calc(super.getA(),super.getB());
	}

}
