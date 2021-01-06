package com.example.idus.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.idus.bean.UserInfo.UserSearch;
import com.example.idus.bean.UserInfo.UserSignup;
import com.example.idus.service.UserInfoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController("/users")
public class UserInfoController {

	@Autowired
	UserInfoService service;
	
	@GetMapping
	public ResponseEntity<?> get(@RequestParam UserSearch search) {
		return ResponseEntity.ok(service.getUserList(search));
	}
	
	@PostMapping
	public ResponseEntity<?> post(@RequestBody @Valid UserSignup signup) {
		return ResponseEntity.ok(service.postUser(signup));
	}
	
	@GetMapping("/{seq}")
	public ResponseEntity<?> getUser(@PathVariable int seq) {
		return ResponseEntity.ok(service.getUser(seq));
	}
	
}
