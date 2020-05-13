package demo.oops;

 class Circle extends Shape {
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius= radius;
		System.out.println("circle construcor is called");
	}

	@Override
	double area() {
		return Math.PI*Math.pow(radius, 4);
	}

	@Override
	public String toString() {
		return "color of circle is "+super.getColor()+"Area of circle is"+area();
	}

}
