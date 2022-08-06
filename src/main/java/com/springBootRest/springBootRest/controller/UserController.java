package com.springBootRest.springBootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootRest.springBootRest.entity.User;
import com.springBootRest.springBootRest.service.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServices userServices;

	@GetMapping("/")
	public List<User> getAllUser() {
		return this.userServices.getAllUser();
	}

	@PostMapping("/add")
	public User AddUser(@RequestBody User user) {
		return this.userServices.AddUser(user);
	}

}
