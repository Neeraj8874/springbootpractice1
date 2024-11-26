package com.neeraj.springbootpractice1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neeraj.springbootpractice1.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
