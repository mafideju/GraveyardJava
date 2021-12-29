package com.mafideju.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new BoxingCoach();
		
		System.out.println("Treino do dia: ".concat(theCoach.getDailyWorkout()));

	}

}
