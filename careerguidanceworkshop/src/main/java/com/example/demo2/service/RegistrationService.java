package com.example.demo2.service;

import java.util.List;

import com.example.demo2.entity.Registration;

public interface RegistrationService {

    Registration saveRegistration(
            Registration registration);

    List<Registration> getAllRegistrations();

}