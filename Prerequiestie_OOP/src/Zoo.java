
public class Zoo {

	public static void main(String[] args) {
		Animal bear= new Animal();
		bear.age=2;
		bear.gender="feamle";
		bear.weightInPounds=45;
		bear.aboutanimal();
		bear.eat();
		
		Animal bear= new Animal("bear",2,"female",25);
		Animal cat= new Animal("cat",3,"Male",3);
		bear.aboutanimal();
		bear.eat();
		cat.aboutanimal();
		cat.eat();
		
		Brid cucukoo= new Brid();
		cucukoo.typeofbird="cucukoo";
		cucukoo.color="blue";
		cucukoo.aboutbird();
		cucukoo.eat();
		
		Fish shark = new Fish("Shark","Grey");
		shark.aboutfish();
		shark.eat();

		
		//CAR CLASS ABOUT COMPLEX DATATYPES
		
//		Car myCar= new Car();
//		myCar.hp=120;
//		Car my2Car= new Car();
//		my2Car.hp=1000;
//		Engine bigEngine= new Engine();
//		my2Car.myEngine=bigEngine;
//		System.out.println(bigEngine);
		
	}

}
