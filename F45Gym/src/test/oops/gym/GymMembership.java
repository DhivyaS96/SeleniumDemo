package test.oops.gym;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GymMembership {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<Customer> custobj=new ArrayList<Customer>();
		System.out.println("Enter the number of customers in gym");
		int input= sc.nextInt();
		Customer cust= new Customer();
		for (int i=0;i<input;i++) {
			System.out.println("Enter customer ID");
			cust.setId(sc.nextInt());
			System.out.println("Enter customer name");
			cust.setName(sc.next());
			System.out.println("Enter customer weight");
			cust.setWeight(sc.nextFloat());
			System.out.println("Enter customer exp");
			cust.setExp(sc.nextBoolean());
			custobj.add(cust);
		}
		
//		for(Customer c: custobj){
//		if(c.getWeight()>35 && c.getWeight()<=50){
//				System.out.println("Lean category");
//			}
//		else if(c.getWeight()>51 && c.getWeight()<=75){
//			System.out.println("Normal Category");
//		}else if(c.getWeight()>76 && c.getWeight()<=150){
//			System.out.println("Obese Category");
//		}else{
//			System.out.println("Person not persent in gym");
//		}
	
	//}	
		List<Workout>exercise= new ArrayList<Workout>();
		Workout leanworkout= new LeanCategory();
		leanworkout.setWid(100);
		Workout normalworkout= new NormalCategory();
		normalworkout.setWid(200);
		Workout obeseworkout= new ObeseCategory();
		obeseworkout.setWid(300);
		exercise.add(leanworkout);
		exercise.add(normalworkout);
		exercise.add(obeseworkout);

		Map<Workout, Customer> gym= new HashMap<Workout, Customer>();
		for(Customer c: custobj){
			if(c.getWeight()>35 && c.getWeight()<=50){
					gym.put(exercise.get(0), c);
					System.out.println("Customer added to lean category");
			}if(c.getWeight()>51 && c.getWeight()<=75){
				gym.put(exercise.get(1), c);
				System.out.println("Customer added to normal category");
			}if(c.getWeight()>76 && c.getWeight()<=150){
					gym.put(exercise.get(2), c);
					System.out.println("Customer added to obese category");
			}else{
					System.out.println("Cannot take the person");
				}
		}
		//Scanner n= new Scanner(System.in);
		System.out.println("Enter the Customer ID");
		int gid=sc.nextInt();
		for(Customer customer:custobj){
			if(customer.getId()==gid){
				for(Map.Entry<Workout, Customer>entry: gym.entrySet()){
					if(entry.getValue().equals(customer)){                     // check for the key-value pairs
						entry.getKey().Cardio();
						entry.getKey().HiitWorkout();
						entry.getKey().Pilates();
						entry.getKey().PowerYoga();
						entry.getKey().WeightTraining();
						entry.getKey().Yoga();
						System.out.println(entry.getValue().getId());
						System.out.println(entry.getValue().getName());
						System.out.println(entry.getValue().getWeight());
						
	
					}
				}
			}
		}
		sc.close();
	}
}

