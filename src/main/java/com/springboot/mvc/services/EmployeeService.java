package com.springboot.mvc.services;

import java.util.List;

import com.springboot.mvc.persistence.Employee;

public interface EmployeeService {
	public Employee save(final Employee employee);

	public List<Employee> getList();

}
