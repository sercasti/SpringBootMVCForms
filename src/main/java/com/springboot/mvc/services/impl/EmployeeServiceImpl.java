package com.springboot.mvc.services.impl;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.springboot.mvc.persistence.Employee;
import com.springboot.mvc.repositories.EmployeeRepository;
import com.springboot.mvc.services.EmployeeService;

@Service
@Validated
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	@Autowired
	private EmployeeRepository repository;

	@Transactional
	public Employee save(@NotNull @Valid final Employee employee) {
		LOGGER.debug("Creating {}", employee);
		return repository.save(employee);
	}

	@Transactional(readOnly = true)
	public List<Employee> getList() {
		LOGGER.debug("Retrieving the list of all users");
		return repository.findAll();
	}

}
