package program.oops;

public class StudConstOverload {

	public static void main(String[] args) {
		ConstOverloadDemo s= new ConstOverloadDemo("Dhivya");
		ConstOverloadDemo m= new ConstOverloadDemo();
		System.out.println(s.name);
		System.out.println(m.name);

	}

}
