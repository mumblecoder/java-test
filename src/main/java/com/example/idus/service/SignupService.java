package com.example.idus.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idus.bean.UserInfo.UserSignup;
import com.example.idus.repository.UserInfoRepository;

@Service
public class SignupService {
	
	@Autowired
	UserInfoRepository userInfoRepository;

	public Object signup(@Valid UserSignup signup) {
		
		
		
		return null;
	}

}
