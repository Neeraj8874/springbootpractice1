package com.neeraj.springbootpractice1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	private String empName;
	private int empSalary;
	private String empDepartment;

	public Employee() {

	}

	public Employee(long empId, String empDepartment, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empDepartment = empDepartment;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId =" + empId + ", empDepartment=" + empDepartment + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}
