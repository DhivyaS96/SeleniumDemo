
public class Demo1 {

	public static void main(String[] args) throws ArithmeticException{
		int a=10,b=5,c=5,result;
		try{
			result=a/(b-c);
			System.out.println(result);
			
		}
		catch(ArithmeticException e){
			System.out.println("Arithemetic exception caught: number cant be divided by zero");
		}
		finally{
			System.out.println("Finally block executed");
		}
		
//		try{
//			String str="ball";
//			if(str.equals("balls")){
//				throw new StringIndexOutOfBoundsException("testing throw");
//			}else if(str.equals("ball")){
//				throw new StringIndexOutOfBoundsException();
//			}
//		
//		}catch(StringIndexOutOfBoundsException e){
//			System.out.println("Testing throw verified");
//		}
//
	}

}
