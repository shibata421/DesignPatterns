package br.com.cod3r.bridge.converter.employees;

import java.math.BigDecimal;

public abstract class Employee {
	protected String name;
	protected Integer age;
	protected BigDecimal salary;
	
	public Employee(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = new BigDecimal(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary.doubleValue();
	}

	public void setSalary(Double salary) {
		this.salary = new BigDecimal(salary);
	}
}
