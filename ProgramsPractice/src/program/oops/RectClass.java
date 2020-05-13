package program.oops;

public class RectClass {

	public static void main(String[] args) {
		RectClass r= new RectClass(5, 8);
		RectClass k= new RectClass(4, 5);
		System.out.println("Area of rect is"+r.Area());	
		System.out.println("Area of rect is"+k.Area());	
		System.out.println("perimeter of rect is"+r.peri());	
		System.out.println("perimeter of rect is"+k.peri());	
	}
	int length,breath;
	public RectClass(int length,int breath) {
		this.length=length;
		this.breath=breath;
	}
	public double Area() {
		return length*breath;
	}
	public double peri() {
		return 2*(length+breath);
	}
	
}
