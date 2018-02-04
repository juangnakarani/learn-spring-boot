package com.juangnakarani.learning.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import com.juangnakarani.learning.domain.User;

import com.juangnakarani.learning.domain.User;

public interface UserRepository  extends CrudRepository<User, String>{
	User findByEmail(String email);
}
