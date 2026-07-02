package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.entity.Registration;
import com.example.demo2.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl
        implements RegistrationService {

    @Autowired
    private RegistrationRepository repository;

    @Override
    public Registration saveRegistration(
            Registration registration) {

        return repository.save(registration);
    }

    @Override
    public List<Registration> getAllRegistrations() {

        return repository.findAll();
    }
}