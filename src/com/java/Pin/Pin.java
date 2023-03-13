package com.java.Pin;

import java.util.Scanner;

import com.java.home.Home1;

public class Pin 
{
public static void Pin_Check() // TO check if Enter Pin is Valid 

{
	int DPin = 0000;
	System.out.println("Please Enter Your Pin Number");
	Scanner sc =new Scanner(System.in);
	int PIN = sc.nextInt();	
	
	
	if(DPin==PIN)
	
	 Home1.After_Pin();
	
	else 
	{
	System.out.println("Please Enter Correct Pin");
			
	}
	
	
}
}
