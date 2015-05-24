package com.tirthal.learning.java2scala.javaway.inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Test class instance for demo of interface default methods in Java 8
 * 
 * @author tirthalp
 * @see <a href="https://github.com/tirthalpatel/Learning-Java/blob/master/Java8/src/com/tirthal/learning/langfeatures/Ex_DefaultStaticMethodsInInterface.java">Java 8 - default methods in interface</a>
 */
public class InterfaceDefaultMethodSample {
		
	public static void main(String[] args) {
		Users users = new Users();
		users.add(new User("Tids", 34));
		users.add(new User("Adam", 40));
		users.add(new User("Ian", 4));
		System.out.println("Users sorted by name: " + users.sort());
		
		users = new UsersSortableByAge();
		users.add(new User("Tids", 34));
		users.add(new User("Adam", 40));
		users.add(new User("Ian", 4));
		System.out.println("Users sorted by age: " + users.sort());
	}
}

// Interface providing default ability of sorting for generic type A to be a sub-type of Comparable in collection
interface Sortable<A extends Comparable<A>> extends Iterable<A> {
	
	// default sorting implementation, which may be overridden by class implementing this interface 
	default public List<A> sort() {
		List<A> list = new ArrayList<>();
		for(A element: this)
			list.add(element);
		list.sort(null); // null indicates to use natural comparison method - User#compareTo()
		return list;
	}
}

// Users class gets default sorting behavior from the default sort() implementation in Sortable interface
class Users implements Sortable<User> { // Here, User class must be sub-type of Comparable

	private final Set<User> users = new HashSet<>();
	
	public void add(User user) {
		users.add(user);
	}
	
	@Override
	public Iterator<User> iterator() {			
		return users.iterator();
	}		
}

class User implements Comparable<User> {
	
	private String fname;
	private Integer age;
	
	User(String fname, Integer age) {
		this.fname = fname;
		this.age = age;
	}
	
	public String getFname() {
		return fname;
	}

	public Integer getAge() {
		return age;
	}
	
	@Override
	public int compareTo(User u) {
		return fname.compareTo(u.fname); // Keep default natural ordering to sort user by fname
	}
	
	@Override
	public String toString() {
		return fname + "'s age is " + age;
	}
}

// Another UsersSortableByAge class overrides default sorting behavior of Sortable interface
class UsersSortableByAge extends Users {
	
	@Override
	public List<User> sort() {
		List<User> users = new ArrayList<>();
		for(User u: this)
			users.add(u);
		users.sort((first, second) -> second.getAge().compareTo(first.getAge()));
		return users;
	}
}

