package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		EmployeeTest emp1 = new EmployeeTest(1, "a");
		EmployeeTest emp2 = new EmployeeTest(2, "b");
		EmployeeTest emp3 = new EmployeeTest(3, "c");
		List<EmployeeTest> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Integer.value
		list.stream().min(Comparator.c)

	}

}

class EmployeeTest implements Comparable<EmployeeTest> {
	int age;
	String name;

	public EmployeeTest(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(EmployeeTest arg0) {
		if (this.age < arg0.getAge()) {
			return 1;
		} else if (this.age > arg0.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "EmployeeTest [age=" + age + ", name=" + name + "]";
	}

}
