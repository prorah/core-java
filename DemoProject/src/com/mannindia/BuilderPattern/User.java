package com.mannindia.BuilderPattern;

public class User {
	private final String firstName;// mandatory
	private final String lastName;// mandatory
	private final int age;// optional

	public User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getLastName() {
		return lastName;
	}

	public static class UserBuilder {
		private String firstName;
		private String lastName;
		private int age;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}
}
