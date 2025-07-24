package com._minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner
{
   private static GammingCosole game;
   
   public GameRunner(@Qualifier("SuperContraGameQualifier") GammingCosole game)
   {
      GameRunner.game = game;
   }
   
   public static void run()
   {
      System.out.println("Running game " + game);
      game.up();
      game.down();
      game.left();
      game.right();
   }
}

