package com._minutes.learn_spring_framework.game;

public class GameRunner
{
   private static GammingCosole game;

   public GameRunner(GammingCosole game)
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

