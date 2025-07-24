package com.symos.CrudJavaSpring1Tabela.Repositories;

import com.symos.CrudJavaSpring1Tabela.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Integer>
{}
