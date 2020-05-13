package demo.oops;

public class AbstractionDemo {
			
	public static void main(String[] args) {
		Food obj= new Briyani();
		Food obj1= new Friedrice("10");
		Food obj2= new Cheesecake("433");
		obj.prepare();
		obj2.prepare();
		obj1.prepare();
		

	}
		
}
