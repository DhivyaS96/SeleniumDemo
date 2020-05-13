package Java_Basics;

public class MyUtils {

		public static String PrintSomeStuff(String args) {
			//System.out.println("Some String bla bla bla"+args);
			return args;
		}
		public static int PrintSomeStuff(int args) {
			//System.out.println("Integer stuff"+args);
			return args;
		}
		public static void PrintSomeStuff(int firstArg,int secondArg) {
			System.out.println(firstArg+secondArg);
		}
		public int add10(int someArg) {
			int result= someArg+10;
			return result;
		}

}
