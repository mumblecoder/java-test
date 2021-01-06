package com.example.idus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.idus.bean.UserInfo;
import com.example.idus.bean.UserInfo.UserPublic;
import com.example.idus.bean.UserInfo.UserSearch;
import com.example.idus.bean.UserInfo.UserSignup;
import com.example.idus.repository.UserInfoRepository;

@Service
public class UserInfoService {
	
	@Autowired
	UserInfoRepository repository;
	
	/** 유저 리스트를 조회하는 로직 */
	public Page<UserInfo> getUserList(UserSearch search) {
		if (search.getSize() < 1) {
			search.setSize(10);
		}
		if (search.getPage() < 0) {
			search.setPage(1);
		}
		PageRequest page = PageRequest.of(search.getPage(), search.getSize());
		Page<UserInfo> result = repository.findAllByEmailContainingOrNameContainingOrderBySeq(search.getSearch(), search.getSearch(), page);
		
		return result;
	}

	/** 특정 유저의 정보를 조회하는 로직 */
	public UserPublic getUser(int seq) {
		
		UserInfo user = repository.findById(seq).orElseThrow();
		
		//TODO UserPublic으로 변환해서 리턴할 것 
		
		return null;
	}

	/** 유저 회원가입 로직 */
	public UserPublic postUser(UserSignup signup) {
		
		UserInfo user = repository.findByUserId(signup.getUserId());
		if (user != null) {
			//TODO 아이디가 중복이므로 에러처리
			return null;
		}
		
		user = new UserInfo();
		user.setUserId(signup.getUserId());
		user.setName(signup.getName());
		user.setGender(signup.getGender());
		user.setNickname(signup.getNickname());
		user.setPhone(signup.getPhone());
		user.setEmail(signup.getEmail());
		user = repository.save(user);
		
		//TODO UserInfo -> UserPublic으로 변환해서 리턴 
		
		return null;
	}


}
