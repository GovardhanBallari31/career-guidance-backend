package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.entity.career;
import com.example.demo2.repository.careerRepository;

@Service
public class careerserviceImpl
        implements careerservice {

    @Autowired
    private careerRepository repo;

    @Override
    public List<career> getAllCareers() {
        return repo.findAll();
    }

    @Override
    public career saveCareer(career Career) {
        return repo.save(Career);
    }

    @Override
    public career getCareer(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteCareer(Long id) {
        repo.deleteById(id);
    }

	@Override
	public career savecareer(career Career) {
		// TODO Auto-generated method stub
		return null;
	}
}