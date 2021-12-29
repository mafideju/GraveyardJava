package com.mafideju.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AthleticsCoach implements Coach {
	
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public AthleticsCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	public String doSomeCrazyStuff() {
		return "doSomeCrazyStuff => doSomeCrazyStuff()";
	}

	@Override
	public String getDailyWorkout() {

		return "Sem desculpas. Vai andar uma hora hoje.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
