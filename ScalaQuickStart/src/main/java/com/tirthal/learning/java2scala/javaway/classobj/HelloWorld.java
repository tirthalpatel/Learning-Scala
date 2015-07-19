package com.tirthal.learning.java2scala.javaway.classobj;

// Java way - say hello world and print date

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class HelloWorld {

	public static void main(String[] args) {

		String hello = "Hello World!";
		System.out.println(hello);
		
		Date now = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);

		System.out.println("Hello, world @ " + df.format(now));
		
		System.out.println(foo());
	}
	
	public static String foo() {
		return "Foo";
	}
}
