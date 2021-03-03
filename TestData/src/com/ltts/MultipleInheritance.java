package com.ltts;

public class MultipleInheritance 
	{	
		public static void main(String[] args) 
		{
			child1 c= new child1();
			//c.display1(); //method of parent1 class
			c.display2(); //method of parent2 class
			c.show();
		}
	
	}

class parent1 
{	
		void display1()
		{
			System.out.println("Parent1 Class Method");
		}
}

interface parent2 
{
		default void display2() //abstract method
		{
			System.out.println("Parent2 Class Method");
		}
}

class child1 extends parent1 implements parent2
{
	void show()
	{
		System.out.println();
	}
	public void display2()
	{
		System.out.println("Interface method");
	}
}


