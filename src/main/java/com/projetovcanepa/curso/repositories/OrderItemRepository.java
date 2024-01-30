package com.projetovcanepa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetovcanepa.curso.entities.OrderItem;
import com.projetovcanepa.curso.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
