package com.example.demo2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo2.dto.loginRequest;
import com.example.demo2.entity.user;
import com.example.demo2.service.userservice;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class usercontroller {

    @Autowired
    private userservice service;

    // Register User
    @PostMapping
    public user register(@RequestBody user User) {
        return service.saveUser(User);
    }

    // Get All Users
    @GetMapping
    public List<user> getAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping("/login")
    public user login(@RequestBody loginRequest request){

        System.out.println("Email: " + request.getEmail());
        System.out.println("Password: " + request.getPassword());

        user User = service.login(
                request.getEmail(),
                request.getPassword());

        if(User == null){
            throw new RuntimeException("Invalid Email or Password");
        }

        return User;
    }
    // Delete User
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {

        service.deleteUser(id);

        return "User Deleted Successfully"; 
    }

}