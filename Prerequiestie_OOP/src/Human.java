
public class Human {

		String name;
		int age;
		int heightInIches;
		String eyecolor;
		public Human(String name, int age, int heightInIches, String eyecolor) {
			this.name = name;
			this.age = age;
			this.heightInIches = heightInIches;
			this.eyecolor = eyecolor;
		}
		//CONSTRUCTOR
		//HARD CODING CONSTRUCTOR
//		public Human() {
//		    name="tom";
//			age=54;
//			heightInIches=75;
//			eyecolor="brown";
//			
//		}
		
		public void speak() {
			System.out.println("Hello, My name is "+name);
			System.out.println("I'm"+heightInIches+"tall");
			System.out.println("I'm"+age+"of age");
			System.out.println("My eyecolor is"+eyecolor);
		}
		public void eat() {
			System.out.println("eating...");
		}
		public void walk() {
			System.out.println("walking...");
		}
		public void work() {
			System.out.println("working...");
		}

	}