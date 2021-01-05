package com.example.idus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.idus.bean.Order.OrderSearch;
import com.example.idus.service.OrderService;

@RestController("/orders")
public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping
	public ResponseEntity<?> getOrderList(@RequestParam OrderSearch search) {
		return ResponseEntity.ok(service.getOrderList(search));
	}
	
	@GetMapping("/users/{userSeq}")
	public ResponseEntity<?> getOrderListByUserSeq(@PathVariable int userSeq){
		return ResponseEntity.ok(service.getOrderListByUser(userSeq));
	}
	
}
