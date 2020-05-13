package program.oops;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
//		String s="Umberlla";
//		boolean per= false;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='e') {
//				per=true;
//				break;
//			}
//		}
//		System.out.println(per);
		
		
//		String sentence="This is orange juice";
//		boolean present= false;
//		for(int i=0;i<sentence.length();i++) {
//			if(sentence.contains("orange")) {
//				present=true;
//				break;
//			}
//		}
//		System.out.println(present);
		
		
//		String e="Hello , world";
//		System.out.println(e.lastIndexOf('o'));
//		System.out.println(e.indexOf(","));
		
//		Scanner s= new Scanner(System.in);
//		String str= s.next();
//		//String str= "Hello , Have a good day";
//		//int vowel=0;
//		for(int i=0;i<str.length();i++) {
//			char ch= str.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' '||ch==',') {
//				System.out.print(ch);
//			}
//		}
		
		String str= "Grass is greener on the side";
		int count=0,i,j;
		char[] ch= str.toCharArray();
		for(i=0;i<str.length();i++) {
			for( j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Maximum occurence is"+ch[j]);
					count++;
					break;
				}
			}
			
		}
	}

}
