package com._minutes.learn_spring_framework.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring
{
   
   private static final Logger log = LoggerFactory.getLogger(App02HelloWorldSpring.class);
   
   public static void main(String[] args)
   {
      //:1Launch a Spring context
      try (var context = new AnnotationConfigApplicationContext(HelloWorldConfigurationClass.class))
      {
         //2: Configure the things that we want Spring to manage- @Configuration
         
         //3:  Retriving Beans managed by Spring
         System.out.println(context.getBean("name"));
         System.out.println(context.getBean("age"));
         System.out.println(context.getBean("person"));
         System.out.println(context.getBean("person2"));
         System.out.println(context.getBean("address2"));
         //System.out.println(context.getBean(Address.class));
         
         //Show all the beans
         Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      }
   }
}
