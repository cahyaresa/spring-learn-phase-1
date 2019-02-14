package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
			 new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		 
		// inside the class
		System.out.println(theCoach.getDailyWorkout());
		
		// close context
		context.close(); 
		
	}

}
