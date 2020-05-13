package program.oops;

public class Employee extends Member{
	
	String specilization;
	
	public Employee(String specilization) {
		this.specilization = specilization;
	}
	
	public String toString() {
		return "Emplopyee name: "+getName()+"age: "+getAge()+"phone number: "+getPhoneno()+"address: "+getAddress()+"Salary: "+getSalary()+"specilization: "+this.specilization; 
	}

}
