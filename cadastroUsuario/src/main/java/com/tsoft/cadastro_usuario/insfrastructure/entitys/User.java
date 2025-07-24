package com.tsoft.cadastro_usuario.insfrastructure.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
@Entity
public class User
{
   @Id
   @GeneratedValue
   private Integer id;

   @Column(name = "email", unique = true, nullable = false)
   private String email;

   @Column(name = "name", nullable = false)
   private String name;

}
