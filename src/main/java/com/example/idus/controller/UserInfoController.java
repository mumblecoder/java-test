package com.example.idus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.idus.service.UserInfoService;

@RestController("/users")
public class UserInfoController {

	@Autowired
	UserInfoService service;
	
	@GetMapping("/{seq}")
	public ResponseEntity<?> getUser(@PathVariable int seq) {
		return ResponseEntity.ok(service.getUser(seq));
	}
	
}
