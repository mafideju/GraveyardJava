package com.mafideju.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/studentForm")
	public String studentForm(Model model) {
		
		Student student = new Student();
		
		// String completeStudentName = student.getFirstName() + " " + student.getLastName();
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/studentView")
	public String studentView(@ModelAttribute("student") Student student) {
				
		// String completeStudentName = 
		System.out.println(student.getFirstName() + " " + student.getLastName());
		
		return "student-view";
	}

}
