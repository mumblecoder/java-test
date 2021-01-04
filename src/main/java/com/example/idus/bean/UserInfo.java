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
		@Pattern(regexp = "[가-힣a-zA-Z]{1,20}")
		String name;
		@Pattern(regexp = "[a-z]{1,30}")
		String nickname;
		@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{10,}")
		String password;
		@Pattern(regexp = "[0-9]{1,20}")
		String phone;
		@Max(value = 100)
		@Pattern(regexp = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$")
		String email;
		@Nullable
		@Pattern(regexp = "F|M")
		String gender;
	}
	
}
