package com.mannindia.BuilderPattern;

public class BuilderTest {

	public static void main(String[] args) {
		User user = new User.UserBuilder("rahul", "rajput").age(25).build();
	}

}
