package com.zion.personal_finance_system.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.zion.personal_finance_system.entities.Salary;
import com.zion.personal_finance_system.entities.User;
import com.zion.personal_finance_system.entities.enums.SalarySource;
import com.zion.personal_finance_system.repositories.SalaryRepository;
import com.zion.personal_finance_system.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SalaryRepository salaryRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Amanda", "amanda@gmail.com", "123456");
		User u2 = new User(null, "Juan", "juan@hotmail.com", "abcdef");
		
		Salary s1 = new Salary(null, SalarySource.JOB, Instant.parse("2024-07-31T07:00:00Z"), 5000.00, u1);
		Salary s2 = new Salary(null, SalarySource.JOB, Instant.parse("2024-07-30T07:00:00Z"), 2500.00, u2);
		Salary s3 = new Salary(null, SalarySource.EXTERNAL_SERVICE, Instant.parse("2024-08-14T07:00:00Z"), 5000.00, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		salaryRepository.saveAll(Arrays.asList(s1, s2, s3));
	}

}
