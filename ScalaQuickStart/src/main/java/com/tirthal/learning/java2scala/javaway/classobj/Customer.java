package com.tirthal.learning.java2scala.javaway.classobj;

// Java way - Create Class and Objects + Defining fields within Class definition

// Define class Customer
public class Customer {

	// Defining fields
	private String id;
	private final String name;
	private final String address;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		// Create object of class Customer
		Customer c1 = new Customer("Tirthal", "Ahmedabad 380054");
		c1.setId("01");
		System.out.println(c1.getId() + "-" + c1.getName() + "-" + c1.getAddress());
	}

}
