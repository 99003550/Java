package com.ltts;

import java.util.Scanner;

class CustomException extends Exception
{
    CustomException()
    {
        System.out.println("CustomException: InvalidAgeRangeException");
    }
}

public class Player 
{
	public static void main(String[] args) throws CustomException {
		String pname;
		int page;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the player:");
		pname=sc.nextLine();
		System.out.println("Enter age of the player:");
		page=sc.nextInt();
		if(page<19)
		{
		    throw new CustomException();
		}
		else
		{
		   System.out.println("Player name:"+pname);
		   System.out.println("Player age:"+page); 
		}
		
	}
}
