package com.learning.springboot.thymeleafapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.springboot.thymeleafapp.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
