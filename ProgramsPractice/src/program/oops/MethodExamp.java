package program.oops;

public class MethodExamp {

	public static void main(String[] args) {
		Jmethod var= new Jmethod();
		var.ivalue=10;
		var.jvalue=89;
		var.jvalue=var.ivalue;
		var.printNum();

	}
	

}
class Imethod{
	int ivalue;
	public void printNum() {
		System.out.println(ivalue);
		}
	}
	class Jmethod extends Imethod{
		int jvalue;
		public void printNum() {
			System.out.println(jvalue);
		}
	}