package com.tirthal.learning.java2scala.javaway.inheritance;

/**
 * Test class for sub-type inheritance demo - Dog class is inheriting behavior of Animal class and can have its own too.
 *
 * @author tirthalp
 * @see <a href="https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPrinciples/src/com/tirthal/learning/oop/concepts/Inheritance_TestDrive.java">Inheritance Concept</a>
 */
public class SubTypeSample {

	public static void main(String[] args) {
		Dog dog = new Dog(123);
		dog.sound();
	}
}

// Super class
class Animal {
	private final int id;

	public Animal(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
	public void sound() {
		System.out.println("By default it is mute");
	}
}

// Sub class
class Dog extends Animal {

	public Dog(int id) {
		super(id);
	}

	// Own behavior
	private void bark() {
		System.out.println("Dog '" + getId() + "' is barking");
	}

	// Overriding super class behavior
	@Override
	public void sound() {
		bark();
	}
}
