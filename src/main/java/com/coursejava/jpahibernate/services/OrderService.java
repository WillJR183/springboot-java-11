package com.coursejava.jpahibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.jpahibernate.entities.Order;
import com.coursejava.jpahibernate.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj =  orderRepository.findById(id);
		return obj.get();
	}

}
