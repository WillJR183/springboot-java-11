package com.coursejava.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.jpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
