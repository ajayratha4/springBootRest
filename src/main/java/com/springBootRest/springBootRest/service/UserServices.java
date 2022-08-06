package com.springBootRest.springBootRest.service;

import java.util.List;

import com.springBootRest.springBootRest.entity.User;

public interface UserServices {
	public List<User> getAllUser();

	public User AddUser(User user);
}
