package com.example.demo2.service;

import java.util.List;

import com.example.demo2.entity.career;

public interface careerservice {

    List<career> getAllCareers();

    career savecareer(career Career);

    career getCareer(Long id);

    void deleteCareer(Long id);

	career saveCareer(career Career);
}