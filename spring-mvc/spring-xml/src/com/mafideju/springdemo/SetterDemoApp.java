package com.mafideju.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GymCoach theCoach = context.getBean("myGymCoach", GymCoach.class);
		
		System.out.println("Treino do Dia: ".concat(theCoach.getDailyWorkout()));
		System.out.println("Dica do Dia: ".concat(theCoach.getDailyAdvice()));
		System.out.println("Biscoito da sorte: ".concat(theCoach.getDailyFortune()));
		System.out.println("Email: " + theCoach.getEmailAddress());
		System.out.println("Team: " + theCoach.getTeam());
		
		context.close();
	}
}
