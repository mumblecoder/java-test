package com.example.idus.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.idus.bean.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{
	
	@Query(value = "SELECT "
			+ "FROM ( "
			+ " SELECT u.seq, MAX(o.seq)  "
			+ " FROM user_info u LEFT JOIN order o ON u.seq = o.user_seq "
			+ " WHERE email ilike '%?1%' OR name ilike '%?2%' "
			+ "GROUP BY u.seq "
			+ ") t LEFT JOIN user_info u ON t.seq", nativeQuery = true)
	Page<UserInfo> findAllByEmailContainingOrNameContainingOrderBySeq(String search, String search2, PageRequest page);

	UserInfo findByUserId(String userId);

}
