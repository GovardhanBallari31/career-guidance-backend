package com.example.demo2.service;

import java.util.List;

import com.example.demo2.entity.user;

public interface userservice {

    user saveUser(user User);

    List<user> getAllUsers();

    user login(String email,String password);


	void deleteUser(int id);

}