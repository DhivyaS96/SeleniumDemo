package Java_Basics;

import someotherpackage.Example;

public class LearningMethods {

	public static void main(String[] args) {
//		System.out.println("Dhivya");
//		System.out.println(MyUtils.PrintSomeStuff(" This is some data"));
//		int var= MyUtils.PrintSomeStuff(34);
//		System.out.println(var);
//		MyUtils.PrintSomeStuff(10,23);
//		int myvar= MyUtils.add10(99)+1000;
//		System.out.println(myvar);
//		int newvar=Example.dosomething(44);
//		System.out.println(newvar);
		MyUtils myvar;
		myvar=new MyUtils();
		int holdvar= myvar.add10(44);
		System.out.println(holdvar);
	}
	

}
