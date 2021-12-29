package com.mafideju.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach athleticsCoach = context.getBean("athleticsCoach", Coach.class);
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("...................................................");
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(athleticsCoach.getDailyWorkout());
		System.out.println("...................................................");
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(athleticsCoach.doSomeCrazyStuff());
		System.out.println(athleticsCoach.getDailyFortune());
		
		context.close();
		
	}

}
