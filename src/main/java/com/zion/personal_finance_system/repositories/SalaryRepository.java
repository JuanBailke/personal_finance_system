package com.zion.personal_finance_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zion.personal_finance_system.entities.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Long>{

}
