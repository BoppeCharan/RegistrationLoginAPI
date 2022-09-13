package com.infy.user.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.user.login.entity.User;
import com.infy.user.login.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}
	
	public List<User> getUser() {
		
		return userRepository.findAll();
	}

	public User getUserById(Long userId) {
		return userRepository.findByUserId(userId);
	}

	public User getUserByName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public User findUserById(Long userId) {
		return userRepository.findByUserId(userId);
	}

	public User findUserByName(String userName) {
		return userRepository.findByUserName(userName);
	}

//	public User updateUserById(Long userId, User user) {
//		return userRepository.upda;
//	}

//	public User updateUser(User user) {
//		return userRepository.saveOr;
//	}

	public User updateUserById(Long userId, User user) {
		User db = userRepository.findByUserId(userId);
		
		db.setUserName(user.getUserName());
		db.setUserEmail(user.getUserEmail());
		db.setUserPassword(user.getUserPassword());
		return userRepository.save(db);
	}

//	public String deleteUserById(Long userId) {
//		User db = userRepository.findByUserId(userId);
//		userRepository.delete(db);
//		return "deleted";
//	}

	public String deleteUserById(Long userId) {
		User db = userRepository.findByUserId(userId);
		userRepository.delete(db);
		return "deleted";
	}
}
