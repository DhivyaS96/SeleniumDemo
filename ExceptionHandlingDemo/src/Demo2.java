
public class Demo2 {
	
	 public Demo2(){
			System.out.println("From constructor");
		}
	 {
		 System.out.println("From anonomyous block ");
	 }
	 static{
		 System.out.println("From static block");
	 }
	 public void membermethod(){
		 System.out.println("From non static block");
	 }
	 public static final void demo1(){
		 System.out.println("From final block");
	 }
	 public void finalze(){
			System.out.println("Fnalize method overriden");
		}


	public static void main(String[] args) {
		Demo2 demo= new Demo2();
		demo.membermethod();
		demo.demo1();
		System.gc();
		demo.finalze();
		
		
	}

}
