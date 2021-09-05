package com.mafideju.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String studentView(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
			System.out.println(bindingResult);
		if (bindingResult.hasErrors()) {
			return "student-form";
		} else {
			return "student-view"; 
		}
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	

}
