package test.proj.gym;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GymMembership  {
	public static void main(String[] args) {
		List<Customer>client= new ArrayList<Customer>();
		Customer custobj= new Customer();
		Customer custobj1=new Customer();
		Customer custobj2=new Customer();
		Customer custobj3=new Customer();
		Customer custobj4=new Customer();
		Customer custobj5=new Customer();
		custobj.setGid(234);
		custobj.setWeight(50);
		custobj.setName("Dhivya");
		custobj.setExp(false);
		
		custobj1.setGid(567);
		custobj1.setWeight(43);
		custobj1.setName("Ram");
		custobj1.setExp(true);
		
		custobj2.setGid(345);
		custobj2.setWeight(67);
		custobj2.setName("Elsa");
		custobj2.setExp(true);
		
		custobj3.setGid(765);
		custobj3.setWeight(75);
		custobj3.setName("Ray");
		custobj3.setExp(false);
		
		custobj4.setGid(890);
		custobj4.setWeight(88);
		custobj4.setName("Julia");
		custobj4.setExp(false);
		
		custobj5.setGid(876);
		custobj5.setWeight(98);
		custobj5.setName("Isabel");
		custobj5.setExp(true);
		
		client.add(custobj);
		client.add(custobj1);
		client.add(custobj2);
		client.add(custobj3);
		client.add(custobj4);
		client.add(custobj5);
		
		for (Customer customer : client) {
			
	
		//Lean category
		if(customer.getWeight()>35 && customer.getWeight()<=50) {
			if(customer.isExp()==false) {
				System.out.println("Lean Bignner");
			}
		}
		if(customer.getWeight()>35 && customer.getWeight()<=50) {
			
			if(customer.isExp()==true) {
				System.out.println("Lean Expert");
			}
		}
		
		//Normal Category
		if(customer.getWeight()<=50 && customer.getWeight()>=75) {
			if(customer.isExp()==false) {
				System.out.println("Normal Beginner");
			}
		}
		if(customer.getWeight()<=50 && customer.getWeight()>=75) {
			if(customer.isExp()==true) {
				System.out.println("Normal Expert");
			}
		}
		
		//Obese category
		if(customer.getWeight()>=76) {
			if(customer.isExp()==false) {
				System.out.println("Obese Beginner");
			}
		}
		if(customer.getWeight()>=76) {
			if(customer.isExp()==true) {
				System.out.println("Obese Expert");
			}
		}
		
	}
		
		
		
//		BeginnerWorkout begin= new BeginnerWorkout();
//		ExpertWorkout expert= new ExpertWorkout();
//		begin.setWid(345);
//		expert.setWid(231);
		
		
		Map<Workout,Customer > map= new HashMap<Workout,Customer>();
		Workout begin= new BeginnerWorkout();
		Workout expert= new ExpertWorkout();
		//expert.setWid(231);
		
		for (Customer customer : client) {
			if(customer.isExp()==true){
				map.put(expert, customer);
			} else{
				map.put(begin, customer);
			}
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		int gid = sc.nextInt();// get cust id
		
		for(Customer cust: client){    // iterate through the list to find the customer
			if(cust.getGid() == gid){  // verify the customer details
				for(Map.Entry<Workout, Customer> entry:map.entrySet()){    // iterate through the map
					if(entry.getValue().equals(cust)){                     // check for the key-value pairs
						entry.getKey().GymWorkout();
					}
				}
			}
		}
		
		
		
		sc.close();
		
		/*
		Customer c= new Customer();
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		Customer c4=new Customer();
		Customer c5=new Customer();
		c.setGid(234);
		c.setWeight(50);
		c.setName("Dhivya");
		c .setExp(false);
		
		c1.setGid(567);
		c1.setWeight(43);
		c1.setName("Ram");
		c1.setExp(true);
		
		c2.setGid(345);
		c2.setWeight(67);
		c2.setName("Elsa");
		c2.setExp(true);
		
		c3.setGid(765);
		c3.setWeight(75);
		c3.setName("Ray");
		c3.setExp(false);
		
		c4.setGid(890);
		c4.setWeight(88);
		c4.setName("Julia");
		c4.setExp(false);
		
		c5.setGid(876);
		c5.setWeight(98);
		c5.setName("Isabel");
		c5.setExp(true);
		
		map.put(begin, c);
		map.put(begin, c1);
		map.put(begin, c2);
		map.put(begin, c3);
		map.put(begin, c4);
		map.put(begin, c5);

		
*/		/*for (Customer customer : client) {
			
	
		//Lean category
		if(customer.getWeight()>35 && customer.getWeight()<=50) {
			if(customer.isExp()==false) {
				System.out.println("Lean Bignner");
			}
		}
		if(customer.getWeight()>35 && customer.getWeight()<=50) {
			if(customer.isExp()==true) {
				System.out.println("Lean Expert");
			}
		}
		
		//Normal Category
		if(customer.getWeight()<=50 && customer.getWeight()>=75) {
			if(customer.isExp()==false) {
				System.out.println("Normal Beginner");
			}
		}
		if(customer.getWeight()<=50 && customer.getWeight()>=75) {
			if(customer.isExp()==true) {
				System.out.println("Normal Expert");
			}
		}
		
		//Obese category
		if(customer.getWeight()>=76) {
			if(customer.isExp()==false) {
				System.out.println("Obese Beginner");
			}
		}
		if(customer.getWeight()>=76) {
			if(customer.isExp()==true) {
				System.out.println("Obese Expert");
			}
		}
		
	}
	*/	
		
//		Set<BeginnerWorkout> beginner= new HashSet<BeginnerWorkout>();
//		BeginnerWorkout begin= new BeginnerWorkout();
//		begin.setWid(890);
//		Set<ExpertWorkout> expertise= new HashSet<ExpertWorkout>();
//		ExpertWorkout expert= new ExpertWorkout();
//		expert.setWid(345);
//		Set<Workout> excercise = new HashSet<Workout>();
//		excercise.addAll(beginner);
//		excercise.addAll(expertise);
//		
//		Map<Customer,Workout>gym= new HashMap<Customer,Workout>();
//		gym.put(client.get(0), begin);
//		gym.put(client.get(0), expert);
		
		}


	}
	

