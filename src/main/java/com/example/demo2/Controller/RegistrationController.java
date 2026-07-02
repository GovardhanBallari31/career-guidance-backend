package com.example.demo2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo2.entity.Registration;
import com.example.demo2.service.RegistrationService;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin("*")
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping
    public Registration saveRegistration(
            @RequestBody Registration registration) {

        return service.saveRegistration(
                registration);
    }

    @GetMapping
    public List<Registration> getAllRegistrations() {

        return service.getAllRegistrations();
    }
}