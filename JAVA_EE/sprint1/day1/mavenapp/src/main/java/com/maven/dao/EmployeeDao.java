package com.maven.dao;

import com.maven.exception.EmployeeException;
import com.maven.model.Employee;

public interface EmployeeDao {
	public String registerEmployee(Employee employee)throws EmployeeException;

	public Employee getEmployeeById(int empId)throws EmployeeException;
}
