package com.LearningSpring.learnspringframework.examples.e1;

import java.util.Arrays;import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ClassB{
	
}

@Configuration
@ComponentScan
public class BeanScopeStudy {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(BeanScopeStudy.class)) {
			
			System.out.println(context.getBean(ClassA.class));
			System.out.println(context.getBean(ClassA.class));
			
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class));
		} 
	}
}
