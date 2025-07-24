package com._minutes.learn_spring_framework;

import com._minutes.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava
{
   
   public static void main(String[] args)
   {
      
      try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class))
      {
         context.getBean(GameRunner.class);
         GameRunner.run();
      /*var marioGame = new MarioGame();
      var superContraGame = new SuperContraGame();
      var PacManGame = new PacManGame();
      var gameRunner = new GameRunner(PacManGame);

      GameRunner.run();*/
      }
   }
}
