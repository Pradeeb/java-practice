package com.java.learn.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	int id; String name;String department;double salary;
};
public class Q1Interview {
	


	public static void main(String[] args) {
		
		
		List<Employee> employee=Arrays.asList(
				new Employee(1,"Valan","IT",25000),
				new Employee(2,"Pradeeb","IT",20000),
				new Employee(3,"Selva","CSS",28000),
				new Employee(4,"Arul","CS",25000)
				);
		
		Map<String,Double> ans = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		                 
		System.out.println(ans);

	}

}
