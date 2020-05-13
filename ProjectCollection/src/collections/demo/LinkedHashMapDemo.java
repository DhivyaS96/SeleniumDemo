package collections.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,LinkedhashmapBook> map= new LinkedHashMap<Integer,LinkedhashmapBook>();
		LinkedhashmapBook b1= new LinkedhashmapBook(1,"Dhivya","Yashwanth singh",9);
		LinkedhashmapBook b2= new LinkedhashmapBook(101,"elsa","meher singh",91);
		LinkedhashmapBook b3= new LinkedhashmapBook(110,"Vanshi","Jogar sharma ",19);
		
		map.put(2, b1);
		map.put(1, b3);
		map.put(3, b2);
		
		for (Map.Entry<Integer,LinkedhashmapBook >entry: map.entrySet()) {
			int key=entry.getKey();
			LinkedhashmapBook value= entry.getValue();
			System.out.println(key+":");
			System.out.println(value.id+""+value.author+""+value.publisher+""+value.quantity);
		}

	}

}
