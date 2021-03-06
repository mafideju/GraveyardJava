package com.mafideju.springdemo;

public class RunningCoach implements Coach {

	private FortuneService fortuneService;
		
	public RunningCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Aquecimento de 1 hora + Correr 3 KM na subida";
	}
	
	@Override
	public String getDailyAdvice() {
		return "Descanse no sol quente.";
	}

	@Override
	public String getDailyFortune() {
		return "Corredor, " + fortuneService.getFortune();
	}

}
