package com.ltts;

public class TestEmployee 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setName("Ravi");
		e.setAddress("Pune");
		e.setNumber("9998887771");
		System.out.println(e.getName()+" "+e.getAddress()+" "+e.getNumber());
	}
}
