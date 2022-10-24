package com.practice.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.spring.learnspringframework.enterprise.MyWebController;
import com.practice.spring.learnspringframework.game.GameRunner;
import com.practice.spring.learnspringframework.game.MarioGame;
import com.practice.spring.learnspringframework.game.SuperContraGame;
import com.practice.spring.learnspringframework.game.PacmanGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//PacmanGame game = new PacmanGame(); //1
		//GameRunner runner = new GameRunner(game); //2
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
