package program.oops;

public class TriangleClass {

//		int a,b,c,peri,area;
//		public TriangleClass() {
//			a=3;
//			b=5;
//			c=7;
//			peri=a+b+c;
//			area=(b*c)/2;
//		}

//		public static void main(String[] args) {
//			TriangleClass sh= new TriangleClass();
//			System.out.println("Perimeter of triangle is "+sh.peri);
//			System.out.println("Area of triangle is"+sh.area);
	
//	  int a,b,c;
//	  public double getperimeter() {
//		  return (a+b+c)/2;
//	  }
//	  public double getarea() {
//		  double s=( a+b+c)/2;
//		  return Math.pow((s*(s-a)*(s-b)*(s-c)), 5);
//	  }
//	
//	   public static void main(String[] args) {
//		   TriangleClass t= new TriangleClass();
//		   t.a=6;
//		   t.b=4;
//		   t.c=6;
//		   System.out.println("Perimeter of triangle "+t.getperimeter());
//		   System.out.println("area of triangle "+t.getarea());
//	}
	int a,b,c;
	public TriangleClass(int a, int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getperi() {
		return  (a+b+c)/2;
	}
	public double getarea() {
		double s=(a+b+c)/2;
		return Math.pow(s*((s-a)*(s-b)*(s-c)), 5);
	}
	public static void main(String[] args) {
		TriangleClass s1= new TriangleClass(5, 6, 7);
		System.out.println("Perimeter"+s1.getperi());
		System.out.println("Area"+s1.getarea());
	}

}
