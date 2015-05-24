package com.tirthal.learning.java2scala.javaway.generics;

import java.util.ArrayList;
import java.util.List;

// Syntax of Generics in Java
public class GenericsSyntax {

	public static void main(String[] args) {		
		
		// Generics = Parametric Polymorphism
		Stack<String> stack = new ListStack<>();
		stack.push("A3");
		stack.push("A2");
		stack.push("A1");
		String element = stack.pop();
		System.out.println(element);
	}
	
	// Generic method
	public <A> void add(A a) {
		// ...
	}
}

// Generic Stack Example in Java

interface Stack<T> { // Generic interface
	void push(T t);
	T pop();
}

class ListStack<T> implements Stack<T> { // Generic class
	private final List<T> elements = new ArrayList<>();

	@Override
	public void push(T t) {		
		elements.add(0, t);
	}

	@Override
	public T pop() {			
		if(elements.isEmpty())
			throw new IndexOutOfBoundsException();
		return elements.remove(0);
	}
}

// Bound Types Syntax

class BoundTypesSyntax { 
	
	//****** ? = wildcards 
	
	//****** extends keyword = Upper Bounds
	// <? extends T> - It will allow either T or subclasses of T, and T represents upper bound
	public void ex1(List<? extends Number> list) {
		// Number is upper bound, so either "Number" or subclass of "Number" (e.g. Integer, Float) is acceptable
	}
	
	//****** super keyword = Lower Bounds 
	// <? super T> - It will allow T and super classes of T, and T represents lower bound
	public void ex2(List<? super Integer> list) {
		// Integer is lower bound, so either "Integer" or super class of "Integer" (e.g. Number) is acceptable
	}
	
	//****** Unbounded wildcard = unknown generic type 
	// For example - List<?> list
	
	//****** Java can set multiple upper bounds
	// For example - public static <A extends Animal & Comparable<Animal>> void sort(List<A> list) { ... }
	
	//****** Java cannot set lower and upper bounds
}
