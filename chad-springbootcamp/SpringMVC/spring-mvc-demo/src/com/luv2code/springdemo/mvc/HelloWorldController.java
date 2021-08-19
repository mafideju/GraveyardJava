package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Já falei, \"" + theName + ", LARGA ESSA MERDA!\" Mas continua fingindo que não me escuta...";
		
		model.addAttribute("result", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2V3")
	public String letsShoutDudeAgain(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		
		String gritodois = "Versão do " + theName + ".";
		
		model.addAttribute("gritodois", gritodois);
		
		return "helloworld";
	}
}
