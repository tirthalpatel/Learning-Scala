package com.tirthal.learning.java2scala.javaway.inheritance;

//Test class instance for java interface demo
public class InterfaceSample {
	public static void main(String[] args) {
		FooBarImpl fb = new FooBarImpl();
		fb.foo();
		fb.bar();
	}
}

// Java interfaces

interface Foo {
	public void foo();
}

interface Bar {
	public void bar();
}

// In Java - you can implement multiple interfaces using "implements" keyword

class FooBarImpl implements Foo, Bar {

	// @Override is optional, so you may remove it

	@Override
	public void foo() {
		System.out.println("I am foo");
	}

	@Override
	public void bar() {
		System.out.println("I am bar");
	}
}