package program.oops;

public class PrintNumberMethod {

	public static void main(String[] args) {
		PrintNumberMethod p= new PrintNumberMethod();
		System.out.println(p.printn());
		System.out.println(p.printn(336653));
		System.out.println(p.printn(4));
		System.out.println(p.printn(425.43));

	}
	public int printn(int i) {
		return i;
	}
	public String printn() {
		return "This is string method of same name";
	}
	public double printn(double a) {
		return a;
	}
	public float printn(float f) {
		return f;
	}


}
