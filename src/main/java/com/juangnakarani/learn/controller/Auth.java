package com.juangnakarani.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juangnakarani.learn.beans.User;

@RestController
@RequestMapping("/auth")
public class Auth {

	@RequestMapping("/get-user")
	public User getUser() {
		return new User("juang","nakarani","juang.nakarani@gmail.com");
	}
	
}
