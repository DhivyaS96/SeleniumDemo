package collections.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaryForEmp {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n=s.nextInt();
		List<Employee> list= new ArrayList<Employee>(n);
		Employee emp= new Employee();
		System.out.println("Enter the EmpId: ");
		emp.setEmpid(s.nextInt());
		System.out.println("Enter the EmpName: ");
		emp.setName(s.next());
		System.out.println("Enter the Empdepartment: ");
		emp.setDept(s.next());
		System.out.println("Enter the EmpExp: ");
		emp.setExp(s.nextFloat());
		System.out.println("Enter the EmpDOB: ");
		emp.setDob(s.next());
		list.add(emp);
		
		
		
		List<Salary> list1= new ArrayList<Salary>(n);
		Salary sal= new Salary();
		sal.setEmp(emp);
		float exp= sal.getEmp().getExp();
		if(exp>0 && exp<=1.5) {
			sal.setSal(15000);
		}else if(exp>1.5 && exp<=3.0) {
			sal.setSal(30000);
		}else if(exp>3.0 && exp<=5.0) {
			sal.setSal(45000);
		}else if(exp>5.0 && exp<=7.0) {
			sal.setSal(70000);
		}else if(exp>7.0 && exp<=10.0) {
			sal.setSal(150000);
		}else {
			System.out.println("False information");
		}
		list1.add(sal);
		for (Salary s1 : list1) {
			System.out.println(s1.getSal());
		}
	
	}

}
