package program.oops;

import java.util.Scanner;

public class Company extends Member{

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the enployee details");
		String str = in.next();
		Employee m= new Employee(str);
		m.setName(in.next());
		System.out.println(m.getName());
		m.setAge(in.nextInt());
		System.out.println(m.getAge());
		m.setPhoneno(in.next());
		System.out.println(m.getPhoneno());
		m.setAddress(in.next());
		System.out.println(m.getAddress());
		m.setSalary(in.nextDouble());
		System.out.println(m.getSalary());
		
		System.out.println("Enter the manager details"); 
		String str2= in.next();
		Manager n= new Manager(str2);
		n.setName(in.next());
		System.out.println(n.getName());
		n.setAge(in.nextInt());
		System.out.println(n.getAge());
		n.setPhoneno(in.next());
		System.out.println(n.getPhoneno());
		n.setAddress(in.next());
		System.out.println(n.getAddress());
		n.setSalary(in.nextDouble());
		System.out.println(n.getSalary());
	}

}
