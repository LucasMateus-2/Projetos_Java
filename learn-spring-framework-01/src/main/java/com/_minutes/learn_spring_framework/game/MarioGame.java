package com._minutes.learn_spring_framework.game;

public class MarioGame implements GammingCosole
{
   @Override
   public void up()
   {
      System.out.println("Jump");
   }

   @Override
   public void down()
   {
      System.out.println("Get in hole");
   }

   @Override
   public void left()
   {
      System.out.println("get back");
   }

   @Override
   public void right()
   {
      System.out.println("Acelerate");
   }
}
