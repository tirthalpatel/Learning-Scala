package com.tirthal.learning.java2scala.javaway.classobj;

// Java way - Adding custom logic in getter/setter methods of field?

public class User {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		// Added custom logic...
		if(this.id==null || this.id.isEmpty())
			this.id = id;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setId("001");
		System.out.println("before - " + user.getId());

		user.setId("002");
		System.out.println("after - " + user.getId());
	}
}
