package com.mafideju.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="employee_name")
	private String name;
	
	@Column(name="employee_age")
	private int age;
	
	@Column(name="employee_company")
	private String company;
	
	@Column(name="employee_function")
	private String function;
	
	public Employee() {}

	public Employee(String name, int age, String company, String function) {
		this.name = name;
		this.age = age;
		this.company = company;
		this.function = function;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + " " + name + ", " + age + " anos, " + function + " na " + company + "]";
	}
	
	
}
