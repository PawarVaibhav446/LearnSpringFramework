package com.LearningSpring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")

public class SuperContra implements GamingConsole {
	
	public void upBtn() {
		System.out.println("Jump");
	}
	public void downBtn() {
		System.out.println("Crouch");
	}
	public void leftBtn() {
		System.out.println("Go Back");
	}
	public void rightBtn() {
		System.out.println("Shoot Laser");
	}
}
