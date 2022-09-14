package com.infy.user.login.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.user.login.entity.User;
import com.infy.user.login.service.UserService;

import lombok.extern.slf4j.*;
@CrossOrigin(origins = "http://localhost:9091")
@RestController
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	
	@GetMapping("/")
	public List<User> getUser() {
		return userService.getUser();
	}
	
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long userId) {
		
		return userService.findUserById(userId);
	}
	
	@GetMapping("login/{userName}")
	public User getUserByName(@PathVariable("userName") String userName) {
		
		return userService.findUserByName(userName);
	}
	
	
	@PutMapping("/{id}")
	public User updateUserById(@PathVariable("id") Long userId, @RequestBody User user) {
		
		return userService.updateUserById(userId , user);
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteUserById(@PathVariable("id") Long userId) {
		return userService.deleteUserById(userId);
	}
//	
	
//	@PutMapping("/")
//	public User updateUser( @RequestBody User user) {
//		return userService.updateUser(user);
//	}
	

}
