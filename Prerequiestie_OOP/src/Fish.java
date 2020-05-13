
public class Fish {
	String typeoffish;
	String color;
	
	
	public Fish(String typeoffish, String color) {
		this.typeoffish = typeoffish;
		this.color = color;
	}
	public void aboutfish() {
		System.out.println(typeoffish+" is a kind of fish");
		System.out.println("color of fish is "+color);
	}
	public void eat() {
		System.out.println("Eating...");
	}

}
