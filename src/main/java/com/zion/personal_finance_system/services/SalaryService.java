package com.zion.personal_finance_system.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zion.personal_finance_system.entities.Salary;
import com.zion.personal_finance_system.repositories.SalaryRepository;

@Service
public class SalaryService {

	@Autowired
	private SalaryRepository repository;
	
	public List<Salary> findAll() {
		return repository.findAll(); 
	}
	
	public Salary findById(long id) {
		Optional<Salary> obj = repository.findById(id);
		return obj.get();
	}
}
