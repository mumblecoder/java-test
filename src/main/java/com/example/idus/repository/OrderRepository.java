package com.example.idus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.idus.bean.Orders;

public interface OrderRepository extends JpaRepository<Orders, String>{

	List<Orders> findAllByUserSeqOrderByUserSeqDesc(int userSeq);
	
}
