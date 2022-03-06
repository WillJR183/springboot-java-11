package com.coursejava.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.jpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
