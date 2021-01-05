package com.example.idus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.idus.bean.Order;

public interface OrderRepository extends JpaRepository<Order, String>{

	List<Order> findAllByUserSeqOrderBySeqDesc(int userSeq);
	
}
