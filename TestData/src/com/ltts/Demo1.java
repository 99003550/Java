package com.ltts;

import java.util.Scanner;

public class Demo1 {
	
	static int findElementCount(int[] arr,int size,int num)
	{
		int count=0;
		for(int t:arr)
		{
			if(t==num)
			{
				count++;
			}
		}
		return(count);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of elements:");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input");
			return;
		}
		int[] arr=new int[n];
		System.out.print("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
				return;
			}
		}
		System.out.println("Enter the element to be searched:");
		int ele=sc.nextInt();
		int c=findElementCount(arr,n,ele);
		System.out.println("No of repetition of "+ ele +" is:"+c);
	}
}
