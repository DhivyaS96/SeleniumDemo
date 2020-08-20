package test.oops.jail;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrisonerJail {
	
	public static void main(String[] args) {
	Set<Prisoner> jail= new HashSet<Prisoner>();
	Scanner sc= new Scanner(System.in);
	Prisoner people = null;
	System.out.println("Enter the number of prisoners to be added in set");
	int n=sc.nextInt();
	int id=100;
	for(int i=0;i<n;i++){
		people = new Prisoner();
		System.out.println("Enter the names of prisoners to be added");
		people.setName(sc.next());
		System.out.println("Enter the age of prisoners to be added");
		people.setAge(sc.nextInt());
			if(people.getAge()>35 && people.getAge()<=50){
				System.out.println("Old prison");
			}
			if(people.getAge()>50 && people.getAge()<=70){
				System.out.println("New Prison");
			}
		System.out.println("Id of prisoner is "+id);
		people.setId(id);
		id++;
		jail.add(people);
	}
	
		for(Prisoner p: jail){
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());
		
		} //  jere it prints all
	
		//System.out.println("prisoners added are:"+jail);  //this ll only print the address of the obj
	
	
	
//	System.out.println("Enter the number of prisoners to be removed from set");
//	int m=sc.nextInt();
//	System.out.println("Enter the names of prisoners to be removed");
//	for(int i=0;i<m;i++){
//		jail.remove(sc.next());
//		}
//	System.out.println("Prisoners after removing from set are:"+jail);
//
	}

}
