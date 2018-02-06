package com.juangnakarani.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juangnakarani.learning.domain.User;
import com.juangnakarani.learning.repository.UserRepository;
import com.juangnakarani.learning.service.UserService;

@RestController
public class UserController {
	// private User user;

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public ResponseEntity<User> getUser(@RequestParam(value = "email") String email) {
		User user = this.userService.findByEmail(email);
		HttpStatus status;
		if (user != null) {
			status = HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<User>(user, new HttpHeaders(), status);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		HttpStatus status;
		if (this.userService.findByEmail(user.getEmail()) == null) {
			this.userService.save(user);
			status = HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<String>("email_already_registered", new HttpHeaders(), status);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public ResponseEntity<List<User>> findAll() {
		List<User> users = this.userService.findAll();
		HttpStatus status;
		if (users != null) {
			status = HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		
		return new ResponseEntity<List<User>>(users, new HttpHeaders(), status);
	}


}
