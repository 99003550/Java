package com.ltts;
import java.util.Scanner;

public class RunRate 
{
	public static void main(String[] args) {
		float rn,ov;
		String str,sto;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the total runs scored:");
			str=sc.next();
			 rn = Integer.parseInt(str);  
			System.out.println("Enter the total overs faced:");
			sto=sc.next();
			ov = Integer.parseInt(sto);  
			float rr=rn/ov;
			System.out.printf("Current Run Rate:%.2f",rr);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}
}
