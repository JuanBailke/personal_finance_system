package com.zion.personal_finance_system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zion.personal_finance_system.entities.Salary;
import com.zion.personal_finance_system.services.SalaryService;

@RestController
@RequestMapping(value = "/salaries")
public class SalaryResource {
	
	@Autowired
	private SalaryService service;
	
	@GetMapping
	public ResponseEntity<List<Salary>> findAll(){
		List<Salary> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Salary> findById(@PathVariable Long id){
		Salary obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
