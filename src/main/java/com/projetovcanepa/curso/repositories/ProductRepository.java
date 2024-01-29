package com.projetovcanepa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetovcanepa.curso.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
