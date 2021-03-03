package com.ltts;

public class Test 
	{
		protected int a=10;
		void display()
		{
			System.out.println(this.a);
		}
	}
class Test11 ext5ends Test
{
	int b=20;
	void showInfo()
	{
		System.out.println(this.b);
		System.out.println(super.a);
	}
}