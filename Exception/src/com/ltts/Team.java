package com.ltts;

import java.util.Scanner;
import java.util.ArrayList;

class TeamNameNotFoundCustomException extends Exception
{
    TeamNameNotFoundCustomException()
    {
        System.out.println("TeamNameNotFoundException: Entered team is not a part of IPL Season 1");
    }
}

public class Team 
{
	public static void main(String[] args) throws TeamNameNotFoundCustomException 
	{
	    String s1,s2;
		ArrayList<String> iplteams=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		iplteams.add("RCB");
		iplteams.add("DC");
		iplteams.add("MI");
		iplteams.add("RR");
		iplteams.add("KKR");
		iplteams.add("KXIP");
		iplteams.add("SRH");
		iplteams.add("CSK");
		System.out.println("Enter the expected winner of IPL Season 13:");
		s1=sc.nextLine();
		if(!(iplteams.contains(s1)))
		{
		    throw new TeamNameNotFoundCustomException();
		}
		System.out.println("Enter the expected runnerup of IPL Season 13:");
		s2=sc.nextLine();
		if(!(iplteams.contains(s2)))
		{
		    throw new TeamNameNotFoundCustomException();
		}
		System.out.println("Expected IPL Season 13 winner: DC");
		System.out.println("Expected IPL Season 13 runner: KKR");
		
	}
}
