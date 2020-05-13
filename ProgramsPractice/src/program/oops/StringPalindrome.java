package program.oops;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner s= new Scanner(System.in);
		String str= s.next();
		boolean palindrome=false;
		char[] ch= str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=str.length();j<str.length();j--) {
				if(ch[i]==ch[j]) {
					palindrome=true;
					break;
				}
			}
			System.out.println(palindrome);
		}

	}

}
