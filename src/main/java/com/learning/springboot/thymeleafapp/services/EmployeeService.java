package com.learning.springboot.thymeleafapp.services;

import java.util.List;
import java.util.Optional;

import com.learning.springboot.thymeleafapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springboot.thymeleafapp.models.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAll() {
		return (List<Employee>) employeeRepository.findAll();
	}
	
	public Optional<Employee> getOne(Integer Id) {
		return employeeRepository.findById(Id);
	}
	
	public void addNew(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void update(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void delete(Integer Id) {
		employeeRepository.deleteById(Id);
	}
 }
