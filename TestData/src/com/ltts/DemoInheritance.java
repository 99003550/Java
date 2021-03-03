package com.ltts;

class parent 
{
	/*private int a;
	private int b;*/
	
		void displayInfo()
		{
			System.out.println("Parent Class Method");
		}
		void showInfo()
		{
			System.out.println("Another Parent Class Method");
		}
		
}

class child extends parent 
{
	void getInfo()
	{
	System.out.println("Child class Method");
	}
}

class childchild extends child
	{
		void testInfo()
		{
			System.out.println("ChildChild Class");
		}
	}

public class DemoInheritance 
	{
		public static void main(String[] args) 
		{
			childchild c= new childchild();
			c.displayInfo(); //method of parent class
			c.getInfo(); //method of child class
		    c.showInfo();
		    c.testInfo(); //method of childchild class
		}
		
	}


