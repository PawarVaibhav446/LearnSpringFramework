package com.LearningSpring.learnspringframework.examples.d1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Intialization");
		this.classA = classA;
	}
	
	public void areuUsing() {
		System.out.println("Using Bean B");
	}
	
}

@Configuration
@ComponentScan
public class LazyIntializerLauncher {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(LazyIntializerLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).
			forEach(System.out :: println);
			context.getBean(ClassB.class).areuUsing();
		} 
	}
}
