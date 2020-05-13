package abstractencapsule.oops;

  class Add extends Calculator {

	public Add() {
		System.out.println("Add constructor invoked");
	}
	@Override
	 double calc(double a, double b) {
		return super.getA()+super.getB();
	}
	@Override
	 public String display() {
		return "Addtion value is "+calc(super.getA(),super.getB());
	}

}
