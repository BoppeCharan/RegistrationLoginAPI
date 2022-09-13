package com.infy.user.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.infy.user.login.entity")
public class UserLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserLoginApplication.class, args);
	}
	
}
