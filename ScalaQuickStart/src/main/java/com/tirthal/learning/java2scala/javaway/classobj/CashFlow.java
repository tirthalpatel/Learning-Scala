package com.tirthal.learning.java2scala.javaway.classobj;

// Java way - overloaded constructors 

public class CashFlow {

	// Fields
	private final Double amt;
	private final String curr;
	
	// Java's overloaded constructors
	public CashFlow(Double amt, String curr) {
		this.amt = amt;
		this.curr = curr;
	}
	
	public CashFlow(Double amt) {
		this(amt, "INR");
	}
	
	public CashFlow(String curr) {
		this(0.0, curr);
	}
	
	// Getter methods
	public Double getAmount() {
		return amt;
	}
	
	public String getCurrency() {
		return curr;
	}
	
	// Try it
	public static void main(String[] args) {
		CashFlow cf = new CashFlow(500.0);
		System.out.println("Amount=" + cf.getAmount());
		System.out.println("Currency=" + cf.getCurrency());
	}
}
