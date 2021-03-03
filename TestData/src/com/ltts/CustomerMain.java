package com.ltts;

import java.util.Scanner;

public class CustomerMain 
{
	public static void main(String[] args) 
		{
			String s;;
			System.out.println("Enter Details");
			Scanner sc=new Scanner(System.in);
			customer c= new customer();
			s=sc.next();
			c.setDetails(s); 
	        String[] arrOfStr = s.split(",", 3); 
	        
	        //setting the split values
	        c.setName(arrOfStr[0]); 
	        c.setAddress(arrOfStr[1]);
	        c.setMobile(arrOfStr[2]);
	        
	        //printing the split up values
	        c.displayDetails();
	        
		}
}
