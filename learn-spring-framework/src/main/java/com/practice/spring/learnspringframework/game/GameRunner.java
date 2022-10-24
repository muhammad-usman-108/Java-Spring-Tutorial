package com.practice.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	public GamingConsole getGame() {
		return game;
	}

	public void setGame(GamingConsole game) {
		this.game = game;
	}

	//private MarioGame game;
	@Autowired
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
