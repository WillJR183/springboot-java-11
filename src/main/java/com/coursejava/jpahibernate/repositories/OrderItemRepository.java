package com.coursejava.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.jpahibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
