package demo.oops;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		//IF ELSE
//		System.out.println("Enter age of the person");
//		Scanner in = new Scanner(System.in);
//		int a= in.nextInt();
//		if(a>=18) {
//			System.out.println("Eligible for voting");
//		}
//		else {
//			System.out.println("Not eligible for voting");
//		}

		//IF ELSE
//		int a,b,c;
//		System.out.println("Enter the value of a, b, c");
//		Scanner in= new Scanner(System.in);
//		a= in.nextInt();
//		b=in.nextInt();
//		c=in.nextInt();
//		if(a>b && a>c) {
//			System.out.println("A is greatest");
//		}else if(b>c && b>a) {
//			System.out.println("B is greatest");
//		}else {
//			System.out.println("C is greatest");
//		}
		
		//SWITCH
//		int month;
//		System.out.println("Enter the month");
//		String noOfDaysinMonth;
//		Scanner in= new Scanner(System.in);
//		month= in.nextInt();
//		switch (month) {
//		case 1: noOfDaysinMonth= "31";
//		break;
//		case 2: noOfDaysinMonth= "29";
//		break;
//		case 3: noOfDaysinMonth= "31";
//		break;
//		case 4: noOfDaysinMonth= "30";
//		break;
//		case 5: noOfDaysinMonth= "31";
//		break;
//		case 6: noOfDaysinMonth= "30";
//		break;
//		case 7: noOfDaysinMonth= "31";
//		break;
//		case 8: noOfDaysinMonth= "31";
//		break;
//		case 9: noOfDaysinMonth= "31";
//		break;
//		case 10: noOfDaysinMonth= "30";
//		break;
//		case 11: noOfDaysinMonth= "31";
//		break;
//		case 12: noOfDaysinMonth= "30";
//		break;
//		default: noOfDaysinMonth= "unknown";
//		break;
//		}
//		System.out.println(noOfDaysinMonth);
		
		//WHILE and DO WHILE
		int i,n=0;
		System.out.println("Enter the value");
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		do {
			for(i=n;i<5;i++) {
				System.out.println(i);
			}
		}while(i<5);
//		{
//				//i++;
//				System.out.println(i);
//			
//		}
	}
}


