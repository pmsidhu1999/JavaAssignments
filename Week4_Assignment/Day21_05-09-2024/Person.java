package com.egjson;

import java.util.Arrays;

public class Person {

	private String Name;

	private int agee;
	
	private Address[] address;
	
	public  Person() {}

	public Person(String name, int age, Address[] address) {
		super();
		Name = name;
		this.agee = age;
		this.address = address;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return agee;
	}

	public void setAge(int age) {
		this.agee = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + agee + ", address=" + Arrays.toString(address) + "]";
	}
	
	
}
