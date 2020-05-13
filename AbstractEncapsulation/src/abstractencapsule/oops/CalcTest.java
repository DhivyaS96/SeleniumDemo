package abstractencapsule.oops;

public class CalcTest {

	public static void main(String[] args) {
		Calculator c= new Add();
		c.setA(10);
		c.setB(2);
		System.out.println(c.display());
		Calculator c1= new Sub();
		c1.setA(4);
		c1.setB(2);
		System.out.println(c1.display());
		Calculator c2= new Mul();
		c2.setA(3);
		c2.setB(5);
		System.out.println(c2.display());
		Calculator c3= new Div();
		c3.setA(6);
		c3.setB(2);
		System.out.println(c3.display());


	}

}
