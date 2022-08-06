package com.springBootRest.springBootRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootRest.springBootRest.dao.UserDao;
import com.springBootRest.springBootRest.entity.User;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao userDao;

	@Override
	public List<User> getAllUser() {
		return userDao.findAll();
	}

	@Override
	public User AddUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return user;
	}

}
