package com._minutes.learn_spring_framework;

import com._minutes.learn_spring_framework.game.GameRunner;
import com._minutes.learn_spring_framework.game.GammingCosole;
import com._minutes.learn_spring_framework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration
{
   @Bean
   public GammingCosole game()
   {
      var game = new PacManGame();
      return game;
   }
   
   @Bean
   public GameRunner gameRunner(GammingCosole game)
   {
      var gameRunner = new GameRunner(game);
      return gameRunner;
   }
   
   /*var marioGame = new MarioGame();
   var superContraGame = new SuperContraGame();
   var PacManGame = new PacManGame();
   var gameRunner = new GameRunner(PacManGame);

      GameRunner.run();
   */
}

