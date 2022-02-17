package com.mafideju.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller")
public class FormularyCentralController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "hellorworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hellorworld-dataprocessor";
	}
	
	@RequestMapping("/processFormModel")
	public String processFormModel(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Dado tranferido por " + theName;
		
		model.addAttribute("result", result);
		
		return "hellorworld-dataprocessor";
	}
	
	@RequestMapping("/processFormModelAgain")
	public String processFormModelAgain(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		
		String result = "Dado tranferido por " + theName + " via @RequestParam.";
		
		model.addAttribute("result", result);
		
		return "hellorworld-dataprocessor";
	}

}
