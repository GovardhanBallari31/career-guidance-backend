package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.entity.user;

@Repository
public interface userRepository extends JpaRepository<user,Integer>{

    user findByEmail(String email);

    user findByEmailAndPassword(String email,String password);

}

