package com.projetovcanepa.curso.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projetovcanepa.curso.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
