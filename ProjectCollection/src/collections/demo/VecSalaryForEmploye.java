package collections.demo;

import java.util.Scanner;
import java.util.Vector;

public class VecSalaryForEmploye {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Vector<VecEmploye> vec= new Vector<VecEmploye>();
		VecEmploye emp= new VecEmploye();
		System.out.println("Enter the empid:");
		emp.setEmpid(s.nextInt());
		System.out.println("Enter the empname:");
		emp.setEmpname(s.next());
		System.out.println("Enter the empdept:");
		emp.setEmpdept(s.next());
		System.out.println("Enter the empexp:");
		emp.setEmpexp(s.nextFloat());
		System.out.println("Enter the empdob:");
		emp.setDob(s.next());
		vec.add(emp);
		
		Vector<VecSalary> vec1= new Vector<VecSalary>();
		VecSalary sal= new VecSalary();
		sal.setEmp(emp);
		String empdept= sal.getEmp().getEmpdept();
		if(empdept.equals("IMS")) {
			sal.setSalary(15000);
		}else if(empdept.equals("Middleware")) {
			sal.setSalary(30000);
		}else if(empdept.equals("Testing")) {
			sal.setSalary(45000);
		}else if(empdept.equals("Dev")) {
			sal.setSalary(70000);
		}else {
			System.out.println("False information");
		}
		vec1.add(sal);
		for(VecSalary e: vec1) {
			System.out.println(e.getSalary());
		}
	}

}
