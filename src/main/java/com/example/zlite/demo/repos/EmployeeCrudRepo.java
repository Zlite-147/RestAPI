package com.example.zlite.demo.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zlite.demo.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
	
	

}