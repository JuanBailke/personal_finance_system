package com.zion.personal_finance_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zion.personal_finance_system.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
