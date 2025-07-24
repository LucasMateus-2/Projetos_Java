package com._minutes.learn_spring_framework.game;

public class PacManGame implements GammingCosole
{
   @Override
   public void up()
   {
      System.out.println("Up");
   }

   @Override
   public void down()
   {
      System.out.println("Down");
   }

   @Override
   public void left()
   {
      System.out.println("Left");
   }

   @Override
   public void right()
   {
      System.out.println("Right");
   }
}
