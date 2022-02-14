package com.mafideju.resting.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mafideju.resting.entity.Student;
import com.mafideju.resting.error.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	List<Student> students;
	@PostConstruct
	public void loadData() {
		students = new ArrayList<>();
		students.add(new Student("Marcio", "Rodrigues"));
		students.add(new Student("Milos", "Sesic"));
		students.add(new Student("Chad", "Darby"));
		students.add(new Student("Rhodes", "Lima"));
		students.add(new Student("Israel", "Adesanya"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return students;
	};
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if ((studentId >= students.size()) || (studentId < 0)) {
			throw new StudentNotFoundException("Estudante não encontrado - ID = " + studentId);
		}
		
		return students.get(studentId);	
	}
}
