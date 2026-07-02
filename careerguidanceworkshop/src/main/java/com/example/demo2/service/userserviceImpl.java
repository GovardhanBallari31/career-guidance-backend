package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.entity.user;
import com.example.demo2.repository.userRepository;

@Service
public class userserviceImpl implements userservice {

    @Autowired
    private userRepository repository;

    @Override
    public user saveUser(user User) {
        return repository.save(User);
    }

    @Override
    public List<user> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public user login(String email, String password){

        System.out.println("Email from Controller : " + email);
        System.out.println("Password from Controller : " + password);

        user existingUser = repository.findByEmail(email);

        if(existingUser == null){
            System.out.println("User Not Found");
            return null;
        }

        System.out.println("Password in DB : " + existingUser.getPassword());

        if(existingUser.getPassword().equals(password)){
            System.out.println("Login Success");
            return existingUser;
        }

        System.out.println("Password Mismatch");
        return null;
    }
    
    @Override
    public void deleteUser(int id) {
        repository.deleteById(id);
    }

	

}