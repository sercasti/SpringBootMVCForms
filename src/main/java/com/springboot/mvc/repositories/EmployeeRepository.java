package com.springboot.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mvc.persistence.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
