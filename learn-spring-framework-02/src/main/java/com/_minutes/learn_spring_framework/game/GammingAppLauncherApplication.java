package com._minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com._minutes.learn_spring_framework.game")
public class GammingAppLauncherApplication
{
   public static void main(String[] args)
   {
      try (var context = new AnnotationConfigApplicationContext(GammingAppLauncherApplication.class))
      {
         context.getBean(GameRunner.class);
         GameRunner.run();
      }
   }
}


