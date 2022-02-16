package com.mafideju.springboot.repository;

import java.util.List;

import com.mafideju.springboot.entity.Employee;

public interface EmployeeRepository {

	public List<Employee> findAll();
}
