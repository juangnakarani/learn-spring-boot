package com.juangnakarani.learning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juangnakarani.learning.domain.User;


public interface UserService {
	void save(User user);
	User findByEmail(String email);
	List<User> findAll();
}
