package com._minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GammingCosole
{
   
   @Override
   public void up()
   {
      System.out.println("up");
   }
   
   @Override
   public void down()
   {
      System.out.println("sit down");
   }
   
   @Override
   public void left()
   {
      System.out.println("get back");
   }
   
   @Override
   public void right()
   {
      System.out.println("Shot a bullet");
   }
}
