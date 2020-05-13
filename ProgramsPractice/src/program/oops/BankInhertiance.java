package program.oops;



public class BankInhertiance {

	public static void main(String[] args) {
		Bank n= new Bank();
		System.out.println("Bank class"+n.getBalance());
		 BankA bank1= new BankA();
		System.out.println("Amount of money deposited in Bank1:"+bank1.getBalance());
		BankB bank2= new BankB();
		System.out.println("Amount of money deposited in Bank2 "+bank2.getBalance());
		BankC bank3= new BankC();
		System.out.println("Amount of money deposited in Bank3 "+bank3.getBalance());

	}
	
}
class Bank{
	public int getBalance() {
		return 0;
	}
	}
	 class BankA extends Bank{
		public int getBalance() {
			int bankA=20000;
			return bankA;
		}
	 }
		class BankB extends Bank{
			public int getBalance() {
				int bankB=40000;
				return bankB;
			}
		}
		class BankC extends Bank{
			public int getBalance() {
				int bankC=60000;
				return bankC;
			}
		}
	
