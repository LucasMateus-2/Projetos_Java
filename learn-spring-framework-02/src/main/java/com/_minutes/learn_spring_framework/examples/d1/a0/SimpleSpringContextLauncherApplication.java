package com._minutes.learn_spring_framework.examples.d1.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA
{

}

@Component
@Lazy
class ClassB
{
   private final ClassA classA;
   
   public ClassB(ClassA classA)
   {
      System.out.println("Some Initialization logic");
      this.classA = classA;
   }
}

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication
{
   public static void main(String[] args)
   {
      try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class))
      {
         System.out.println("Initialization of contexte is completed");
         context.getBean(ClassB.class);
      }
   }
}


