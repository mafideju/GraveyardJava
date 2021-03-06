package com.mafideju.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("Treino do Dia: ".concat(theCoach.getDailyWorkout()));
		System.out.println("Dica do Dia: ".concat(theCoach.getDailyAdvice()));
		System.out.println("Biscoito da sorte: ".concat(theCoach.getDailyFortune()));
		
		context.close();
	}

}
