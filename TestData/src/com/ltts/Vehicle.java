package com.ltts;

import java.util.Scanner;

public class Vehicle 
{	

	public static void main(String[] args) 
	{
			System.out.println("Enter Vehicle Type\n 1. Two Wheeler 2. Four Wheeler");
			Scanner sc=new Scanner(System.in);
			Vehicle v= new Vehicle();
			int n=sc.next();
			switch(n)
			{
			case 1: System.out.println("Enter Vehicle Make");
					Scanner sc1=new Scanner(System.in);
					Vehicle v1= new Vehicle();
					String make=sc1.next();
					v1.displayMake();

			}
			
			
			/*System.out.println("Enter Vehicle Make");
			System.out.println("Enter Vehicle Number");
			System.out.println("Enter Vehicle Capacity");*/
			
	}
}

class veh
{
	String make;
	String vehicle_number;
	String fuelType;
	String fuelCapacity;
	String cc;
	
	public veh(String make, String vehicle_number, String fuelType, String fuelCapacity, String cc) {
		super();
		this.make = make;
		this.vehicle_number = vehicle_number;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public void displayMake() 
	{
		System.out.println("Vehicle Make:"+make);
	}
	public void displayBasicInfo()
	{
		System.out.println("");
	}
	public void displayDetailedInfo()
	{
		
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	
}

class twowheeler extends veh
{
	public twowheeler(String make, String vehicle_number, String fuelType, String fuelCapacity, String cc) {
		super(make, vehicle_number, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	boolean kickStartAvailable;
	public void displayDetailInfo() {
		
	}
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
}

class fourwheeler extends veh
{
	public fourwheeler(String make, String vehicle_number, String fuelType, String fuelCapacity, String cc) {
		super(make, vehicle_number, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	String audioSystem;
	int numberOfDoors;
	public void displayDetailInfo()
	{
		
	}
}