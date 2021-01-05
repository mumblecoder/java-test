package com.example.idus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idus.bean.Order;
import com.example.idus.bean.Order.OrderPublic;
import com.example.idus.bean.Order.OrderSearch;
import com.example.idus.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;

	public List<OrderPublic> getOrderListByUser(int userSeq) {
		List<Order> list = repository.findAllByUserSeqOrderBySeqDesc(userSeq);
		
		// 객체 변환해서 리턴하자 
		
		return null;
	}

	public Object getOrderList(OrderSearch search) {
		
		
		return null;
	}

}
