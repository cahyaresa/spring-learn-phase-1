package com.lov2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for email address and team
	private String emailAddress;
	private String team;
	
	//create no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach : inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach : inside no-arg constructor - setFortuneService");
		this.fortuneService = fortuneService;
	}

	//generate getter and setter
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach : inside no-arg constructor - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach : inside no-arg constructor - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
