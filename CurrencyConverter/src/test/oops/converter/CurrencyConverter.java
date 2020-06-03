package test.oops.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		List<Money> currency= new ArrayList<Money>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to be converted");
		int amt= sc.nextInt();
		//sc.nextLine();
		System.out.println("Print the type of money as input");
		int choice= sc.nextInt();
		//sc.nextLine();
		Money rupeemoney= new Rupees();
		Money dollarmoney= new Dollar();
		Money euromoney = new Euro();
		Money poundmoney= new Pound();
		currency.add(poundmoney);
	    currency.add(euromoney);
	    currency.add(dollarmoney);
	    currency.add(rupeemoney);
	    
	    
		switch (choice) {
		case 1:
			System.out.println("Rupees");
			rupeemoney.convert(amt);
			break;
		case 2:
			System.out.println("Dollars");
			dollarmoney.convert(amt);
			break;
		case 3:
			System.out.println("Euro");
			euromoney.convert(amt);
			break;
		case 4:
			System.out.println("Pound");
			poundmoney.convert(amt);

		default:
			System.out.println("Currency not present in list");
			break;
		}				
		
	    
	    

	}

}
