package com.learning.springboot.thymeleafapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.context.WebContext;

import com.learning.springboot.thymeleafapp.models.Employee;
import com.learning.springboot.thymeleafapp.services.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("username", "Kindson");
		List<Employee> employees = employeeService.getAll();
		model.addAttribute("employees", employees);
		return "employees";
	}
	
	@RequestMapping("/getOne") 
	@ResponseBody
	public Optional<Employee> getOne(Integer Id)
	{
		return employeeService.getOne(Id);
	}	
	
	@PostMapping(value="/addNew")
	public String addNew(Employee employee) {
		
		employeeService.addNew(employee);
		return "redirect:/employees/getAll";
				
	}
		
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employee employee) {
		employeeService.update(employee);
		return "redirect:/employees/getAll";
	}
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer Id) {
		employeeService.delete(Id);
		return "redirect:/employees/getAll";
	}
	
}
