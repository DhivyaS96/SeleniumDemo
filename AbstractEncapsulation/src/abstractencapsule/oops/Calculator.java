package abstractencapsule.oops;

 abstract class Calculator {
	 private double a;
	 private double b;
	 
		abstract double calc(double a, double b);
		public abstract String display();

	public double getA() {
			return a;
		}
		public void setA(double a) {
			this.a = a;
		}
		public double getB() {
			return b;
		}
		public void setB(double b) {
			this.b = b;
		}
	public Calculator() {
		System.out.println("Calculator constructor called");
	}

}


