package com.mafideju.springdemo;

public class GymCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Gym: Setter EMAIL Method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Gym: Setter TEAM Method");
		this.team = team;
	}

	public GymCoach() {
		System.out.println("Gym: No args constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Gym: Setter Method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "100Kg de Supino";
	}

	@Override
	public String getDailyAdvice() {
		return "Aque?a para n?o contundir";
	}

	@Override
	public String getDailyFortune() {
		return " - Schwarzenegger disse: " + fortuneService.getFortune();
	}

}
