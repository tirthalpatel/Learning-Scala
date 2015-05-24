package com.tirthal.learning.java2scala.javaway.inheritance;

// Test class for Abstract class demo in Java
public class AbstractClassSample {
	public static void main(String[] args) {
		ColorPrinter cp = new ColorPrinter();
		cp.status();
		cp.print();
	}
}

// Abstract class
abstract class Printer {
	// abstract method - sub-type class is forced to implement this
	public abstract void print();
	// non-abstract method
	public void status() {
		System.out.println("Printer is running");
	}
}

// Sub-type class
class ColorPrinter extends Printer {
	@Override
	public void print() {		
		System.out.println("Print in color");
	}
}