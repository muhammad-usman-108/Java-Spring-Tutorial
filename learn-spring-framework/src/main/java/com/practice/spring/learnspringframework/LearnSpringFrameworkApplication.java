package com.practice.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.spring.learnspringframework.game.GameRunner;
import com.practice.spring.learnspringframework.game.MarioGame;
import com.practice.spring.learnspringframework.game.SuperContraGame;
import com.practice.spring.learnspringframework.game.PacmanGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		PacmanGame game = new PacmanGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
