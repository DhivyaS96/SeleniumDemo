package demo.oops;

public class AbstactDemo {

	public static void main(String[] args) {
		Shape s= new Circle("red",2);
		Shape s1= new Rectangle("blue",4,2);
		Shape s3= new Square("yellow",5);
		System.out.println(s.toString());
		System.out.println(s1.toString());
		System.out.println(s3.toString());
	}

}
abstract class Shape{
	private String color;
	
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color= color;
	}
	public String getColor() {
		return color;
	}
}
 class Circle extends Shape{
	double radius;
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle construcor called ");
		this.radius= radius;
	}
	@Override
	public double area() {
		return Math.PI* Math.pow(radius , 2);
	}
	@Override
	public String toString() {
		return "Color of circle is "+super.getColor()+"Area of circle is "+area();
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length= length;
		this.width= width;
		System.out.println("Rectangle consturctor called");
	}
	@Override
	public double area() {
		return (int) (length* width);
	}
	@Override
	public String toString() {
		return "Color of rectangle is"+ super.getColor()+"area of rectangle is "+area();
	}
}
class Square extends Shape{
	int side;
	public Square(String color, int side) {
		super(color);
		this.side=side;
	}
	@Override
	double area() {         //implicit type casting because when calculatig datatype of side is integer but when returned it is double
		return side*side;
		
	}
	@Override
	public String toString() {
		return "Color of square is "+super.getColor()+ " Area of square is"+area();
		
	}
	
}
