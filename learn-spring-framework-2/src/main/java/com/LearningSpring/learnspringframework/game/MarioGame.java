package com.LearningSpring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class MarioGame implements GamingConsole{
	public void upBtn() {
		System.out.println("Jump");
	}
	public void downBtn() {
		System.out.println("crouch");
	}
	public void leftBtn() {
		System.out.println("Go Back");
	}
	public void rightBtn() {
		System.out.println("Go Front");
	}
}
