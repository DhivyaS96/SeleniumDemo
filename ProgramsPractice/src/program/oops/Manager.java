package program.oops;

public class Manager extends Member {
	
	String department;
	
	public Manager(String department) {
		this.department= department;
	}
	
	public String toString() {
		return "Manager name: "+getName()+"Age: "+getAge()+"Phone number: "+getPhoneno()+"address: "+getAddress()+"Salary: "+getSalary()+"Department: "+this.department;
	}

}
