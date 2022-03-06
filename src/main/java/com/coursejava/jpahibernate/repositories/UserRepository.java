package com.coursejava.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.jpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
