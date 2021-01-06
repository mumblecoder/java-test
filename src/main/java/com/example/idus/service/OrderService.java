package com.example.idus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idus.bean.Orders;
import com.example.idus.bean.Orders.OrderPublic;
import com.example.idus.bean.Orders.OrderSearch;
import com.example.idus.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;

	/** 특정 유저의 주문내역을 조회하는 로직 */
	public List<OrderPublic> getOrderListByUser(int userSeq) {
		List<Orders> list = repository.findAllByUserSeqOrderByUserSeqDesc(userSeq);
		
		// TODO 객체 변환해서 리턴하자 
		
		return null;
	}

}
