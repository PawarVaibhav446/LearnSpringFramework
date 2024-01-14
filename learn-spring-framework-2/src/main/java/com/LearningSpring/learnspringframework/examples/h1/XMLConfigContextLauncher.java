package com.LearningSpring.learnspringframework.examples.h1;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigContextLauncher {
	
	public static void main(String[] args) {
			
		try (var context = 
				new ClassPathXmlApplicationContext("ContextConfig.xml")){
			Arrays.stream(context.getBeanDefinitionNames())
			    .forEach(System.out :: println);
			
			System.out.println(context.getBean("name"));
		} 
	}
}
