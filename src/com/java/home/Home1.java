package com.java.home;

import java.util.Scanner;

public class Home1 
{
 public static void After_Pin() 
{
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Select Your Option ");
	 {
		 System.out.println("1.Check Balance ");
		 }
		 
		 {
			 System.out.println("2.Withdraw money ");
		 }
		 
		 {
			 System.out.println("3.Deposit Money ");
		 }
		 
		 {
			 System.out.println("4.Cancal ");
		 }
	 int Option = sc.nextInt();
	 
	 int Bal=10000;
	 
	 if(Option==1) 
	 {
		 System.out.println("Your Available Balance is"+Bal);
		
	 
	 }
	 if(Option==2) ///Withdraw Money
	 {
		 System.out.println("Please enter Amount to Withdraw  ");
		 int Amt= sc.nextInt();
		 
		 if(Amt<=Bal)
		 {
			 Bal=Bal-Amt;
			 System.out.println(Bal);
		 }
		 else
		 { 
			 System.out.println("Insufficent Fund ");
		 }
		 
		
	 }
	 if(Option==3) 
	 {
		 System.out.println("Please Enter Amount to Deposit ");
		 int Deposit = sc.nextInt();
		 Bal+=Deposit;
		 System.out.println("Your Updated Balance is Rs"+Bal);
		 
	 }
	 if(Option==4) 
	 {
	Home.main(null);
		 
	 }
	 
	 
}
}