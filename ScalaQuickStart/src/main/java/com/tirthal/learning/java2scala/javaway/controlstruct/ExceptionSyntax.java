package com.tirthal.learning.java2scala.javaway.controlstruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// Syntax of exception handling control structures in Java
public class ExceptionSyntax {
	public static void main(String[] args) {
		
		// If you uncomment below line, compiler forces to handle checked exception "Unhandled exception type MalformedURLException"
		// URL url = new URL("http://tirthalpatel.blogspot.com");
		
		// try-catch-finally block
		try {
			URL u = new URL("http://tirthalpatel.blogspot.com");
			BufferedReader r = new BufferedReader(new InputStreamReader(u.openStream()));
			try {
				String l;
				while((l = r.readLine()) != null)
					System.out.println(l);
			} finally {
				r.close();
			}
		} catch(MalformedURLException e) {  // Compiler forces to catch checked exception
			System.out.println("Bad URL");
		} catch (IOException e) {	// Compiler forces to catch checked exception
			System.out.println("Problem in reading data: " + e.getMessage());
		}
	}
}
