package com.mafideju.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Praticar 30 minutos de rebatidas";
	}
	
	@Override
	public String getDailyAdvice() {
		return "Rebata com sabedoria";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
