package program.oops;

import java.util.Scanner;

public class StudentAvgArray extends StudentInfo{
	
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	StudentInfo[] stud = new StudentInfo[8];
	for(int i =0; i<8;i++) {
		
		stud[i] = new StudentInfo();
		System.out.println("Enter Roll num:");
		stud[i].setRollno(s.nextInt());
		System.out.println("Enter mark1:");
		stud[i].setMark1(s.nextInt());
		System.out.println("Enter mark2:");
		stud[i].setMark2(s.nextInt());
		System.out.println("Enter mark3:");
		stud[i].setMark3(s.nextInt());

	}
	for(int j=0;j<8;j++) {
		System.out.println("RollNum: "+stud[j].getRollno());
		System.out.println("Average"+(stud[j].getMark1()+stud[j].getMark2()+stud[j].getMark3())/3);
	}
	s.close();
	
}
}
