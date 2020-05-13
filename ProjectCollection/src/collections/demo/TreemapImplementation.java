package collections.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreemapImplementation {
		 static void ExampleConstructor() {
			sortbyroll sort= new sortbyroll();
			TreeMap<Student,Integer> tree= new TreeMap<Student,Integer>(sort);
			tree.put(new Student(67, "Dhivya","London"),87);
			tree.put(new Student(56, "Elsa","Chennai"),98);
			tree.put(new Student(737, "vanshi","Banglore"),23);
			System.out.println("TreeMap:"+tree);
			
		}
	public static void main(String[] args) {
		System.out.println("Treemap using treemap constructor");
		ExampleConstructor();

	}

}
class Student{
	int rollno;
	String name,address;
	public Student(int rollno,String name,String address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	public String toString() {
		return this.rollno+""+this.name+""+this.address;
	}
	
}
class sortbyroll implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.rollno-b.rollno;
	}
}
