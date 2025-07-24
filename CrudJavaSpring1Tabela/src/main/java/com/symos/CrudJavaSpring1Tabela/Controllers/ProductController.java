package com.symos.CrudJavaSpring1Tabela.Controllers;

import com.symos.CrudJavaSpring1Tabela.Dtos.ProductDto;
import com.symos.CrudJavaSpring1Tabela.Model.Product;
import com.symos.CrudJavaSpring1Tabela.Repositories.ProductsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/products")
public class ProductController
{
   @Autowired
   ProductsRepository repository;
   
   @GetMapping
   public ResponseEntity getAll()
   {
      List<Product> listProductSet = repository.findAll();
      return ResponseEntity.status(HttpStatus.OK).body(listProductSet);
   }
   
   @GetMapping("/{id}")
   public ResponseEntity getByID(@PathVariable(value = "id") Integer id)
   {
      Optional product = repository.findById(id);
      
      if(product.isEmpty())
      {
         return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not Found");
      }
      return  ResponseEntity.status(HttpStatus.FOUND).body(product.get());
   }
   
   @PostMapping
   public ResponseEntity saveProduct(@RequestBody ProductDto dto)
   {
      System.out.println(dto.price());
      System.out.println(dto.name());
      var product = new Product();
      BeanUtils.copyProperties(dto,product);
      
      return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
   }
   
   @DeleteMapping("/{id}")
   public ResponseEntity DeleteByID(@PathVariable(value = "id") Integer id)
   {
      Optional<Product> product = repository.findById(id);
      
      if(product.isEmpty())
      {
         return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not Found");
      }
      repository.delete(product.get());
      var productBody = new Product();
      return ResponseEntity.status(HttpStatus.OK).body("produto deletado");
   }
   
   
   @PutMapping("/{id}")
   public ResponseEntity UpdateByID(@PathVariable(value = "id") Integer id, @RequestBody ProductDto dto)
   {
      Optional<Product> product = repository.findById(id);
      
      if(product.isEmpty())
      {
         return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not Found");
      }
      var productModel = product.get();
      BeanUtils.copyProperties(dto,productModel);
      return ResponseEntity.status(HttpStatus.OK).body(repository.save(productModel));
   }
   
}
