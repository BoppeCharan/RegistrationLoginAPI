package com.infy.user.login.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infy.user.login.entity.*;

public interface UserRepository extends JpaRepository< User, Long > {

	User findByUserId(Long userId);
	
	User findByUserName(String userName);
	
//	@Modifying
//	@Query("update User u set u.userName = ?1, u.userEmail = ?2 where u.userPassword = ?3")
//	User setUserInfoById(String userName, String userEmail, String userPassword);
 
}
