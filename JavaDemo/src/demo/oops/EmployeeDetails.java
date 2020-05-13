package demo.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {
	static Employee[] obj ;

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		List<Employee> e = new ArrayList<Employee>();
		Scanner in= new Scanner(System.in);
		Employee obj1= new Employee();
		System.out.println("Enter the no of employees");
		int n = in.nextInt();
		for(int i=1;i<n;i++) {
			System.out.println("Enter the following details of employee"+i+" empid, empname, dob, salary, dept: ");
			int a= in.nextInt();
			String b= in.next();
			String c= in.next();
			double d= in.nextDouble();
			String ed= in.next();
			for(Employee emp1: e) {
				obj[i].setEmpid(a);
				obj[i].setName(b);
				obj[i].setDob(c);
				obj[i].setSalary(d);
				obj[i].setDept(ed);
				
			}
			e.add(obj[i]);
			
		}
//		
//		System.out.println("Enter the following details of employee2 empid, empname, dob, salary, dept: ");
//		int a1= in.nextInt();
//		String b1= in.next();
//		String c1= in.next();
//		double d1= in.nextDouble();
//		String ed1= in.next();
//		obj1.setEmpid(a1);
//		obj1.setName(b1);
//		obj1.setDob(c1);
//		obj1.setSalary(d1);
//		obj1.setDept(ed1);
//		e.add(obj1);
		for(Employee l: e) {
			
			System.out.println(l.getEmpid());
			System.out.println(l.getName());
			System.out.println(l.getDob());
			System.out.println(l.getSalary());
			System.out.println(l.getDept());
		}
		System.out.println("Enter the values for s and r");
		String s= in.next();
		String r= in.next();
		list.add(s);
		list.add(r);
		for(String emp: list) {
			System.out.println(emp);
		}
		
		

	}

}
