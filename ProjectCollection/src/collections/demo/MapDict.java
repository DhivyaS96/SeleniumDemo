package collections.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapDict {

	public static void main(String[] args) {
		//System.out.println("Enter the word");
		Scanner word= new Scanner(System.in);
		//String s= word.next();
		
		Map<String,String> map= new HashMap<String,String>();
	
//		map.put("accept", "To accept is to receive, and except is to exclude, usually. Both are busy little words skipping around to different meanings, but they never run into each other.");
//		map.put("bare", "Bare means naked, but to bear is to carry something. A bear is also a brown furry animal, but most people keep that one straight.");
//		map.put("confident", "Confident is how you feel on a good hair day, but a confidant is the person you tell when you're secretly wearing a wig. It's no wonder that these words are so easily confused: they were once both confident.");
//		map.put("decent", "Decent is all buttoned up. Descent has all the fun because it gets to climb down a mountain. Dissent is what you do when the glee club wants to get matching red outfits but you like purple.");
//		map.put("empathy", "Empathy is heartbreaking — you experience other people's pain and joy. Sympathy is easier because you just have to feel sorry for someone. Send a sympathy card if someone's cat died; feel empathy if your cat died, too.");
//		map.put("faze", "To faze is to disturb, bother, or embarrass, but a phase is a stage or step. It could faze your family if your princess phase lasts well into your college years.");
//		map.put("hero", "A hero is the firefighter who pulls you out of a burning car. The protagonist is the main character in the story you write about it.");
//		map.put("instant", "Around the Vocabulary.com office, we might like an instance of tea, but we vehemently oppose instant tea.");
//		map.put("mean", "Wordsmiths sometimes dislike numbers, or at least have a hard time grasping them. These words offer us an opportunity to better understand numbers and use their terms more precisely in writing and speaking.");
//		map.put("sarcasm", "Irony, satire, and sarcasm all fall into the category of, \"That's funny but I'm not sure what my English teacher wants me to call it.\"");
//		
//		if(map.containsKey(s)) {
//			System.out.println(map.get(s));
//		}else {
//			System.out.println("Word not found");
//		}
		
		//How to get both key and value from user
		
		for(int i=0;i<3;i++) {
			String s= word.next();
			String h= word.next();
			map.put(s, h);
			
		}
		Set<Entry<String, String>> input = map.entrySet();
		for (Entry<String, String> t : input) {
			System.out.print(t.getKey()+":");
			System.out.println(t.getValue());
			
		}
	
		

	}

}
