package com.symos.CrudJavaSpring1Tabela.Model;

import jakarta.persistence.*;

@Entity (name="Product")
@Table(name="Product")
public class Product
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private Double price;
   
   
   
   
   public Double getPrice()
   {
      return price;
   }
   
   public void setPrice(Double price)
   {
      this.price = price;
   }
   
   public Integer getId()
   {
      return id;
   }
   
   public void setId(Integer id)
   {
      this.id = id;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
}

