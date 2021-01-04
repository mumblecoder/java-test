package com.example.idus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.idus.bean.UserInfo.UserSignup;
import com.example.idus.service.SignupService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController("/signup")
public class SignupController {

	@Autowired
	SignupService service;
	
	@PostMapping
	public ResponseEntity<?> signup(@RequestBody @Valid UserSignup signup) {
		return ResponseEntity.ok(service.signup(signup));
	}
	
}
