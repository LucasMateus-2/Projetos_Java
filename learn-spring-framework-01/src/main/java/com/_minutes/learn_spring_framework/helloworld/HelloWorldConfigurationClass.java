package com._minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address)
{}

record Address(String fristLine, String city)
{}

@Configuration
public class HelloWorldConfigurationClass
{
   @Bean
   public String name()
   {
      return "Lucas";
   }
   
   @Bean
   public int age()
   {
      return 15;
   }
   
   @Bean
   public Person person()
   {
      return new Person("Mateus", 23, new Address("Baker Street", "London"));
   }
   
   @Bean
   public Person person2(String name, int age, Address address)
   {
      var person = new Person(name, age, address);
      return person;
   }
   
   @Bean
   public Person person3(String name, int age, Address address, Address address3)
   {
      var person = new Person(name, age, address3);
      return person;
   }
   
   public Person person4(String name, int age, Address address)
   {
      var person = new Person(name, age, address);
      return person;
   }
   
   @Bean(name = "address2")
   @Primary
   public Address address()
   {
      return new Address("Baker street", "London");
   }
   
   @Bean(name = "address3")
   public Address address3()
   {
      return new Address("Montinagar", "Hyderabad");
   }
}
