package com.neeraj.springbootpractice1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neeraj.springbootpractice1.entities.Employee;
import com.neeraj.springbootpractice1.repositories.EmployeeRepository;

@Service
public class EmployeeService {

@Autowired	
private EmployeeRepository empRepo;


public List<Employee> getAllEmployee(){
	return empRepo.findAll();
}

public Employee getEmployee(Long id) {
	return empRepo.findById(id).get();
}

public Employee addEmployee(Employee e) {
 return empRepo.save(e);	
}

public Employee deleteEmployee(Long id) {
	Employee e = empRepo.findById(id).get();
	empRepo.deleteById(id);	
	return e;
	}
}
