package com.springBootRest.springBootRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootRest.springBootRest.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

}
