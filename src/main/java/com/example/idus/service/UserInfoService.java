package com.example.idus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idus.bean.UserInfo;
import com.example.idus.bean.UserInfo.UserPublic;
import com.example.idus.repository.UserInfoRepository;

@Service
public class UserInfoService {
	
	@Autowired
	UserInfoRepository repository;

	public UserPublic getUser(int seq) {
		
		UserInfo user = repository.findById(seq).orElseThrow();
		
		// UserPublic으로 변환해서 리턴할 것 
		
		return null;
	}


}
