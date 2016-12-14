package com.springboot.mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.mvc.persistence.Employee;
import com.springboot.mvc.services.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:/listEmployees";
	}

	@RequestMapping(value = "/listEmployees", method = RequestMethod.GET)
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeService.getList());
		return "listEmployees";
	}

	@GetMapping(value = "/addEmployee")
	public String addEmployee(Model model) {
		model.addAttribute("employeeForm", new Employee());
		return "addEmployee";
	}

	@PostMapping(value = "/addEmployee")
	public String addEmployee(@ModelAttribute("employeeForm") Employee employee) {
		employeeService.save(employee);
		return "redirect:/listEmployees";
	}
}
