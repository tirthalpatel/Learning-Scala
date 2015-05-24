package com.tirthal.learning.java2scala.javaway.controlstruct;

// Syntax of conditional control structures in Java
public class ConditionalsSyntax {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// (1) ---> if:then - it's a statement in Java, which means it carries out an action
		if (args.length==0)
			System.out.println("Arguments are null");
		else
			System.out.println("Arguments are not null");
		
		// (2) ---> Ternary (?:) - is an expressions in Java, which means it returns a value
		System.out.println(args.length==0 ? "Arguments are null" : "Arguments are not null");
		
		// (3) ---> Switch statement in Java - can match only primitives, enums, strings
		String day = "Monday";
		String dayType = "???"; 
		switch(day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				dayType = "working day";
				break;
			case "Saturday":
			case "Sunday":
				dayType = "holiday";
				break;
			default:
				dayType = "unknown";
				break;
		}
		System.out.println(day + " is " + dayType);
		
	}
}
