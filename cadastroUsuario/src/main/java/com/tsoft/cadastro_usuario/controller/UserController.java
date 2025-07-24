package com.tsoft.cadastro_usuario.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tsoft.cadastro_usuario.business.UserService;
import com.tsoft.cadastro_usuario.insfrastructure.Dtos.UserDto;
import com.tsoft.cadastro_usuario.insfrastructure.entitys.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UserController
{
   private final UserService userService;

   @PostMapping
   public ResponseEntity<Void> saveUser(@RequestBody User user)
   {
      userService.saveUser(user);
      return ResponseEntity.ok().build();
   }

   @GetMapping
   public ResponseEntity<User> findUserByEmail(@RequestParam String email)
   {
      return ResponseEntity.ok(userService.findUserByEmail(email));
   }

   @DeleteMapping
   public ResponseEntity<Void> deleteUsaerByEmail(@RequestBody String email)
   {
      return ResponseEntity.ok().build();
   }

   @PutMapping
   public ResponseEntity<Void> updateUserBYId(@RequestParam Integer id, @RequestBody UserDto userDto)
   {
      userService.updateUserById(id, userDto);
      return ResponseEntity.ok().build();

   }
}
