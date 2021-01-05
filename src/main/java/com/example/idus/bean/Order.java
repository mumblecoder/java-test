package com.example.idus.bean;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Order {
	
	@Id
	String orderNum;
	String productName;
	LocalDateTime orderDt;
	String status;
	int userSeq;
	
	
	@Getter
	@Setter
	@NoArgsConstructor
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public static class OrderPublic {
		String orderNum;
		String productName;
		LocalDateTime orderDt;
		String status;
	}
	
	@Getter
	@Setter
	@NoArgsConstructor
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public static class OrderSearch {
		
		/** 검색단어  */
		String search;
		/** 조회하려는 페이지 번호 */
		Integer page;
		/** 한 페이지에 노출할 목록 수 */
		Integer size;

	}
	
}
