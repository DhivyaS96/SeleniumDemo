package abstractencapsule.oops;

public class Div extends Calculator{
	
	public Div() {
		System.out.println("Div constructor invoked");
	}

	@Override
	double calc(double a, double b) {
		return super.getA()/super.getB();
	}

	@Override
	public String display() {
		return "Division value is "+calc(super.getA(),super.getB());
	}
	
	

}
