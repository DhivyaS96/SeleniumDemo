package program.oops;

import java.util.Scanner;

public class StringVowelsConst {

	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner s = new Scanner(System.in);
		String str= s.next();
		//String str= "geeks for geeks121";
		int vowels=0;
		int constants=0;
		int  numbers=0;
		int splchar=0;
		int space=0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char[] ch=str.toCharArray();
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowels++;
			}else if(ch[i]>='0' && ch[i]<'9') {
				numbers++;
			}else if(ch[i]==' ') {
				space++;
			}
			else if(ch[i]=='!'||ch[i]=='@'||ch[i]=='#'||ch[i]=='$'||ch[i]=='%'||ch[i]=='^'||ch[i]=='&'||ch[i]=='*'||ch[i]=='('||ch[i]==')'){
				splchar++;
			}else {
				constants++;
		}
	}
		System.out.println("Vowels are"+vowels);
		System.out.println("Constants are "+constants);
		System.out.println("Numbers are"+numbers);
		System.out.println("Special char are"+splchar);
		System.out.println("Space are"+space);
	}
}
	
