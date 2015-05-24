package com.tirthal.learning.java2scala.javaway.controlstruct;

import java.util.Arrays;
import java.util.List;

// Syntax of loops and breaks control structures in Java
public class LoopsBreaksSyntax {

	public static void main(String[] args) {		

		// (1) ---> while loop  
		int i = 0;
		while(i < 3) {
			System.out.println(i);
			i++;
		}
		
		// (2) ---> for loop = initialize, check and update
		for(int j = 0; j < i; j++) {
			System.out.println(j);
		}
		
		// for each
		List<Integer> numbers = Arrays.asList(0, 1, 2, 3);
		numbers.forEach(n -> System.out.println(n)); // Alternate syntax = numbers.forEach(System.out::println);
		
		// (3) ---> break
		for(int k = 0; k < 10; k++) {
			System.out.println(k);
			if(k == 5)
				break;			
		}
	}

}
