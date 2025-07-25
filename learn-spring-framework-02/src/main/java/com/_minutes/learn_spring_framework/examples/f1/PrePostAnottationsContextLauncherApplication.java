package com._minutes.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass
{
   private final SomeDependency someDependency;

   public SomeClass(SomeDependency someDependency)
   {
      this.someDependency = someDependency;
      System.out.println("All dependencys are ready");
   }

   @PostConstruct
   public void initialize()
   {
      someDependency.getReady();
   }
}

@Component
class SomeDependency
{
   public void getReady()
   {
      System.out.println("Some logic using SomeDependency");
   }
}

@Configuration
@ComponentScan
public class PrePostAnottationsContextLauncherApplication
{
   public static void main(String[] args)
   {
      try (var context = new AnnotationConfigApplicationContext(PrePostAnottationsContextLauncherApplication.class))
      {
         Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

      }
   }
}


