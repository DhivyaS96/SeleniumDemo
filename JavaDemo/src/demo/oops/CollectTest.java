package demo.oops;

import java.util.ArrayList;
import java.util.List;

public class CollectTest {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		List<CollectionDemo> obj= new ArrayList<CollectionDemo>();
		CollectionDemo object1= new CollectionDemo();
		CollectionDemo object2= new CollectionDemo();
		object1.setId(234);
		object1.setName("Dhivya");
		object1.setWeight(60.4);
		object2.setId(456);
		object2.setName("Paddhu");
		object2.setWeight(500);
		obj.add(object1);
		obj.add(object2);
		for(CollectionDemo o: obj) {
			System.out.println(o.getId());
			System.out.println(o.getName());
			System.out.println(o.getWeight());
		}
		String str1= "abcdef";
		String str2= "cvbgfsd";
		list.add("bjbjd");
		list.add("jhkhk");
		list.add(str1);
		list.add(str2);
		for(String e: list) {
			System.out.println(e);
		}

	}

}
