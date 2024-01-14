package com.LearningSpring.learnspringframework.examples.f1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class someClass{
	
	private D1 d1;
	
	public someClass(D1 d1) {
		super();
		this.d1 = d1;
	}
	
	@PostConstruct
	public void intialize() {
		d1.ready();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("CleanUp");
	}
}

@Component
class D1{
	public void ready() {
		System.out.println("Intializing");
	}
}

@Configuration
@ComponentScan

public class PrePostAnnotationsExample {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(PrePostAnnotationsExample.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
		} 
	}
}
