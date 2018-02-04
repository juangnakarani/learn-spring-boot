package com.juangnakarani.learning.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juangnakarani.learning.entity.User;

@RestController
@RequestMapping("/auth")
public class Auth {
private User user;

	@RequestMapping(method = RequestMethod.GET, value="/user")
	public User getUser() {
		return this.user;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		 this.user = user;
		 return new ResponseEntity<String>("Successfully login", new HttpHeaders(), HttpStatus.OK);
	}
	
}
