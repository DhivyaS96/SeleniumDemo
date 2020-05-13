
public class Animal {
		String typeofanimal;
		int age;
		String gender;
		int weightInPounds;
		
		
		public Animal(String typeofanimal, int age, String gender, int weightInPounds) {
			this.typeofanimal = typeofanimal;
			this.age = age;
			this.gender = gender;
			this.weightInPounds = weightInPounds;
		}
		public void typeofanimal() {
			System.out.println(typeofanimal);
			System.out.println(typeofanimal);
		}
		public void aboutanimal() {
			System.out.println(typeofanimal+" age is "+age);
			System.out.println(typeofanimal+" gender is "+gender);
			System.out.println(typeofanimal+" WeightInPounds is "+weightInPounds);
		}
		public void eat() {
			System.out.println("Eating...");
		}
		public void sleep() {
			System.out.println("Sleeping...");
		}
}
