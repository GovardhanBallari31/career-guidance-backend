package com.example.demo2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo2.entity.career;
import com.example.demo2.service.careerservice;

@RestController
@RequestMapping("/api/careers")
@CrossOrigin("*")
public class careerController {

    @Autowired
    private careerservice service;

    @GetMapping
    public List<career> getAll() {
        return service.getAllCareers();
    }

    @PostMapping
    public career addCareer(
            @RequestBody career career) {

        return service.saveCareer(career);
    }

    @GetMapping("/{id}")
    public career getById(
            @PathVariable Long id) {

        return service.getCareer(id);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.deleteCareer(id);

        return "Deleted Successfully";
    }
    
   
}