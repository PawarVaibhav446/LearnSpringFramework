package com.LearningSpring.learnspringframework.examples.c1;

import java.util.Arrays;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldExampleSpringLauncher {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(RealWorldExampleSpringLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out :: println);
			System.out.println(context.getBean(BusinessCalcService.class).findMax());
		} 
	}
}
