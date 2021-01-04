package com.example.idus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public ResponseEntity<?> getLogin(){
		return ResponseEntity.ok(null);
	}
	
	
}
