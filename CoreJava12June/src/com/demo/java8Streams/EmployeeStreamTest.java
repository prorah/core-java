package com.demo.java8Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamTest {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Rahul Rajput", 22, "M", "Development", 2019, 100000.0));
		employeeList.add(new Employee(2, "Mohan Anchal", 23, "M", "BA", 2017, 115000.0));
		employeeList.add(new Employee(3, "Charu Kushwah", 24, "F", "Development", 2021, 20000.0));
		employeeList.add(new Employee(4, "Prashant Sharma", 25, "M", "Development", 2015, 150000.0));
		employeeList.add(new Employee(5, "Kangan Dureja", 26, "F", "BA", 2019, 90000.0));
		employeeList.add(new Employee(6, "Anchal Kataria", 27, "F", "DBA", 2019, 50000.0));
		employeeList.add(new Employee(7, "Pawan Bhardwaj", 28, "M", "DBA", 2014, 80000.0));

		// Count the number of male and female employees
		// method1(employeeList);

		// Print the name of all available departments
		// method2(employeeList);

		// Average age of male and female employees
		// method3(employeeList);

		// Find max employee salary
		// method4(employeeList);

		// Get the names of all the employees who have joined after 2015
		// method5(employeeList);

		// Count the number of employees in each department
		// method6(employeeList);

		// Average salary of each department
		// method7(employeeList);

		// Get the details of youngest male employee in development department
		// method8(employeeList);

		// Who has the most working experience in the organisation
		// method9(employeeList);

		// How many male and female employees in development team
		// method10(employeeList);

		// Average salary of male and female employees
		// method11(employeeList);

		// Names of all employees in each department
		// method12(employeeList);

		// Average salary and total salary
		// method13(employeeList);

		// Calculate the sum of salaries department wise
		method14(employeeList);

	}

	static void method1(List<Employee> employeeList) {
		Map<String, Long> employeeGenderMap = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));
		System.out.println(employeeGenderMap);
	}

	static void method2(List<Employee> employeeList) {
		employeeList.stream().map(emp -> emp.getDepartment()).distinct().forEach(dept -> System.out.println(dept));
	}

	static void method3(List<Employee> employeeList) {
		Map<String, Double> employeeGenderMap = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.averagingInt(emp -> emp.getAge())));
		System.out.println(employeeGenderMap);
	}

	static void method4(List<Employee> employeeList) {
		Optional<Employee> opt1 = employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(opt1.get().getSalary());
	}

	static void method5(List<Employee> employeeList) {
		employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015)
				.forEach(emp -> System.out.println(emp.getName()));
	}

	static void method6(List<Employee> employeeList) {
		Map<String, Long> employeeDepartmentMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(employeeDepartmentMap);
	}

	static void method7(List<Employee> employeeList) {
		Map<String, Double> avgSalMap = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalMap);
	}

	static void method8(List<Employee> employeeList) {
		Optional<Employee> opt1 = employeeList.stream()
				.filter(emp -> emp.getGender() == "M" && emp.getDepartment() == "Development")
				.min(Comparator.comparingInt(Employee::getAge));
		System.out.println(opt1.get().getName());
	}

	static void method9(List<Employee> employeeList) {
		Optional<Employee> opt2 = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		System.out.println(opt2.get().getName());
	}

	static void method10(List<Employee> employeeList) {
		System.out.println(employeeList.stream().filter(emp -> emp.getDepartment() == "Development")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
	}

	static void method11(List<Employee> employeeList) {
		System.out.println(employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
	}

	static void method12(List<Employee> employeeList) {
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});
	}

	static void method13(List<Employee> employeeList) {
		DoubleSummaryStatistics dss = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(dss.getSum());
		System.out.println(dss.getAverage());
	}

	static void method14(List<Employee> employeeList) {
		System.out.println(employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary))));
	}
}
