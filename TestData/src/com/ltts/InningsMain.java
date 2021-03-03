package com.ltts;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class InningsMain 
{
	public static void main(String[] args) 
	{
		String t;
		String i;
		int r;
		Innings team=new Innings();
		Scanner sc=new Scanner(System.in);
		//teamname
		System.out.println("Enter the team name:");
		t=sc.next();
		team.setTeamname(t);
		//Innings 
		System.out.println("Enter Session:");
		i=sc.next();
		team.setInningsname(i);
		//runs
		System.out.println("Enter runs:");
		r=sc.nextInt();
		team.setRuns(r);
		
		team.displayInningsDetails();
	}
}



		
		
