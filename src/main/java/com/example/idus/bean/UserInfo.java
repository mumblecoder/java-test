package com.example.idus.bean;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.Nullable;

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
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int seq;
	
	String name;
	String nickname;
	String password;
	String phone;
	String email;
	@Nullable
	String gender;
	
	@CreationTimestamp
	LocalDateTime createDt;
	
	@UpdateTimestamp
	LocalDateTime updateDt;
	
	
	@Getter
	@Setter
	@FieldDefaults(level = AccessLevel.PRIVATE)
	@NoArgsConstructor
	public static class UserSignup {
		@Pattern(regexp = "[가-힣a-zA-Z]{1,20}", message = "이름은 한글, 영문 대소문자 20자이내로 입력해주세요")
		String name;
		@Pattern(regexp = "[a-z]{1,30}", message = "영문 소문자 30자 이내로 입력해주세요")
		String nickname;
		@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{10,}", message = "영문 대문자, 소문자, 특수문자, 숫자를 각각 1개이상 입력해주세요")
		String password;
		@Pattern(regexp = "[0-9]{1,20}", message = "숫자만 20자 이내로 입력 가능합니다")
		String phone;
		@Max(value = 100)
		@Pattern(regexp = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$", message = "올바른 이메일 형식이 아닙니다.")
		String email;
		@Nullable
		@Pattern(regexp = "F|M")
		String gender;
	}
	
	@Getter
	@Setter
	@FieldDefaults(level = AccessLevel.PRIVATE)
	@NoArgsConstructor
	public static class UserPublic {
		String name;
		String nickname;
		String phone;
		String email;
		String gender;
	}
	
	
}
