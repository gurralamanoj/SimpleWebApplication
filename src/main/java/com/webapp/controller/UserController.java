package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.model.User;
import com.webapp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getuser/{id}")
	public ResponseEntity<User> getUser(@PathVariable long id){
		User userdata = userService.getUser(id);
		System.out.println(" UserController User data : " + userdata.toString());
		return ResponseEntity.ok(userdata);
	}
}
