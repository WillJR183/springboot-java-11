package com.coursejava.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.jpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
