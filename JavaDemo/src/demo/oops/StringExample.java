package demo.oops;

public class StringExample {

	public static void main(String[] args) {
		String s1="World is a beautiful place!!";
		String s3= "World is better place";
		System.out.println(s1.length());                  //LENGTH()
		char ch= s1.charAt(4);							  //CHARAT()
		System.out.println(ch);
		String s2= String.format("%s to live in",s1);	   //FORMAT()
		System.out.println(s2);
		System.out.println(s1.substring(2,8));	           //SUBSTRING()
		System.out.println(s1.substring(4));				//SUBSTRING()
		//Contains()
		System.out.println(s1.contains("better"));
		if(s3.contains("beautiful")) {
			System.out.println("if loop exceuted");
		}
		else {
			System.out.println("else loop executed");
		}
		//JOIN()
		String s4= String.join("#", "World","is","a","beautiful","place","!");
		System.out.println(s4);
		System.out.println(s1.equals(s2));					//ISEQUALS()
		String s5="";										//ISEMPTY()
		System.out.println(s5.isEmpty());
		System.out.println(s1.isEmpty());
		//CONCAT()
		String s6= s1.concat("to live");
		System.out.println(s6);
		//REPLACE()
		String replacestring = s1.replace("a", "e");
		System.out.println(replacestring);
		//EQUALSIGNORECASE()
		String s7="WORLD IS A BEAUTIFUL PLACE!!";
		boolean s8= s7.equalsIgnoreCase(s1);
		System.out.println(s8);
		//SPILT()
		String[] words= s1.split("\\B");
		for (String w : words) {
			System.out.println(w);
		}
		//TOLOWERCASE()
		String uppercase= s1.toUpperCase();
		System.out.println(uppercase);
		//INTERN()
		String elf= new String ("hello");
		String elf2="hello";
		String elf3= elf.intern();
		System.out.println(elf==elf2);
		System.out.println(elf2==elf3);
		//INDEXOF()
		int inex1= s1.indexOf("is");
		System.out.println(inex1);
		//VALUE()
		String s01= String.valueOf(s1);
		System.out.println(s01+"happily");

	}

}
