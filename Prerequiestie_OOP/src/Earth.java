
public class Earth {

	public static void main(String[] args) {
		
//		Human tom;
//		tom= new Human();
//		tom.age=5;
//		tom.eyecolor="brown";
//		tom.heightInIches=72;
//		tom.name="Tom jerry";
//		tom.speak();
//		tom.eat();
//		
//		Human jo = new Human();
//		jo.age=23;
//		jo.eyecolor="grey";
//		jo.heightInIches=67;
//		jo.name="Jo";
//		jo.speak();
//		jo.walk();
		
		//HARD CODING CONSTRUCTORS
		
//		Human human1= new Human();
//		Human human2= new Human();
//		Human human3= new Human();
//		human1.speak();
//		human2.speak();
//		human3.speak();
		
		
		//ASSIGNING DYNAMICALLY
		Human human1= new Human("Tom",34,72,"Brown");
		Human human2= new Human("Jerry",23,76,"Blue");
		human1.speak();
		human2.speak();
		
	}

}
