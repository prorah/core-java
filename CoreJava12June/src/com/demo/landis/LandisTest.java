package com.demo.landis;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LandisTest {

	public static void main(String[] args) {
		Emp1 emp1 = new Emp1("rahul");
		Emp1 emp2 = new Emp1("rajat");

		Set<Emp1> set = new HashSet<Emp1>();
		set.add(emp1);
		set.add(emp2);
		set.stream().collect(Collectors.toList()).forEach(s->System.out.println(s));

	}

}

class Emp1 {

	private String name;

	public Emp1(String name) {
		super();
		this.name = name;
	}

	public int hashCode() {
		return this.name.length();
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name.length() == ((Emp1) obj).name.length()) {
			return true;
		}
		return false;
	}

}
