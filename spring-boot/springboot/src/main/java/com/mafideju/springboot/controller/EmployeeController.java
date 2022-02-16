package com.mafideju.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mafideju.springboot.entity.Employee;
import com.mafideju.springboot.repository.EmployeeRepository;

@Controller
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeRepository employeeRepository; 
	
	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		System.out.println("***************************************************");
		return employeeRepository.findAll();
	}

}
