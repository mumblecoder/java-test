package com.example.idus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.idus.bean.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{

}
