package demo.oops;

public class OverRidingDemo {
	
	//OVERRIDDING
	public static void main(String[] args) {
		parent parentobj= new parent();
		parentobj.parent1();
		parent childobj= new child();
		childobj.parent1();
		child childobj2= new grandchild();
		childobj2.parent1();
		
	}
	

}

 class parent{
	public void parent1() {
		System.out.println("Parent");
	}
	
 }
 class child extends parent{

	public void parent1(){
		System.out.println("child");
	}
 }
 class grandchild extends child{
	public void parent1() {
		System.out.println("grandchild");
	}
	
}