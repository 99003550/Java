package com.ltts;

public class customer 
{
	private String details;
	private String name;
	private String address;
	private String mobile;
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	void displayDetails()
	{
        System.out.println("Name:"+this.getName());
		System.out.println("Address:"+this.getAddress());
		System.out.println("Mobile:"+this.getMobile());
	}
}
