package com.LearningSpring.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalcService {
	
	private DataService dataService;
	
	public BusinessCalcService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
