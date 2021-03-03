package com.ltts;

public class constructorDemo 
{
	constructorDemo()
	{
		System.out.println("Default Constructor");
	}
	constructorDemo(int a)
	{
		System.out.println("parameterised Constructor");
	}
	
	public static void main(String[] args) 
	{
	constructorDemo c= new constructorDemo();
	constructorDemo c1= new constructorDemo(1000);
	}
}
