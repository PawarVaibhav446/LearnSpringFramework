package com.LearningSpring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole{
	
	public void upBtn() {
		System.out.println("Jump");
	}
	public void downBtn() {
		System.out.println("Crouch");
	}
	public void leftBtn() {
		System.out.println("Pack Reverse");
	}
	public void rightBtn() {
		System.out.println("Pack Eat");
	}
}
