package com.neeraj.springbootpractice1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.springbootpractice1.entities.Employee;
import com.neeraj.springbootpractice1.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

@Autowired	
private EmployeeService empService;
	
@GetMapping("/getAllEmployee")
public List<Employee> getAllEmployee() {
return empService.getAllEmployee();	
}

@GetMapping("/getEmp/{id}")
public Employee getEmployeeById(@PathVariable Long id) {
System.out.println("id:--"+id);	
return empService.getEmployee(id);	
}

@PostMapping("/addEmployee")
public Employee addEmployee(@RequestBody Employee emp) {
    //TODO: process POST request
	System.out.println(emp);
   return empService.addEmployee(emp);
}

@PostMapping("/removeEmployee/{id}")
public Employee addEmployee(@PathVariable Long id) {
	return empService.deleteEmployee(id);
}
}
