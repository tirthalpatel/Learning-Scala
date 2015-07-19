package com.tirthal.learning.java2scala.javaway.classobj;

import java.math.BigDecimal;

// Java way - basic syntax

public class Abc {

	public static void main(String[] args)
	{
		// --- Java has primitives
		// --- Java needs to explicitly tell compiler what is the type of variable
		int age = 34; // primitive "int" type
		Double maxHeartRate = 210 - age * 0.5;
		assert maxHeartRate.equals(193.0);

		// Java - Cannot add two objects with + operator
		BigDecimal total = new BigDecimal(10).add(new BigDecimal(20));
		assert total.equals(new BigDecimal(10+20));

		// --- Equality check in Java (equals vs. ==)
		boolean eq1 = new String("A").equals(new String("A"));	// equals() - value comparison (result = true)
		boolean eq2 = new String("A") == new String("A");		// == - reference comparison   (result = false)
		assert eq1!=eq2;		
	}

	private int len(Object o) {
		return o.toString().length();
	}
}
