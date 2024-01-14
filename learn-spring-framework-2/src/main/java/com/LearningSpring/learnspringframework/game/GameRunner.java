package com.LearningSpring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running Game: " + game);
		game.upBtn();
		game.downBtn();
		game.leftBtn();
		game.rightBtn();
	}
}
