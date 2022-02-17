package com.mafideju.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
		

public class BeanScopeDemoApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("Mesmo escopo? " + (theCoach == secondCoach));
		System.out.println("    The Coach => " + theCoach);
		System.out.println("Segundo Coach => " + secondCoach);
		
		context.close();
		
	}
}
