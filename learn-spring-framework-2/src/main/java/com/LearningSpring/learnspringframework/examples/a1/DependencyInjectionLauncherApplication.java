package com.LearningSpring.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class yourBusinessClass{
	
	Dependecy1 dependecy1;
	Dependecy2 dependecy2;
	
//	@Autowired
	public yourBusinessClass(Dependecy1 dependecy1, Dependecy2 dependecy2) {
		super();
		System.out.println("Calling Constructor Class");
		this.dependecy1 = dependecy1;
		this.dependecy2 = dependecy2;
	}

	public Dependecy1 getDependecy1() {
		return dependecy1;
	}

//	@Autowired
//	public void setDependecy1(Dependecy1 dependecy1) {
//		System.out.println("Setting D1");
//		this.dependecy1 = dependecy1;
//	}

	public Dependecy2 getDependecy2() {
		return dependecy2;
	}
	
//	@Autowired
//	public void setDependecy2(Dependecy2 dependecy2) {
//		System.out.println("Setting D2");
//		this.dependecy2 = dependecy2;
//	}

	public String toString() {
		return dependecy1 + " and " + dependecy2;
	}
}

@Component
class Dependecy1{}

@Component
class Dependecy2{}

@Configuration
@ComponentScan 

public class DependencyInjectionLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(DependencyInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
			System.out.println(context.getBean("yourBusinessClass"));
		} 
	}
}
