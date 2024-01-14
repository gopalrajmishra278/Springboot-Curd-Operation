                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        package com.gopal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gopal.entity.Employee;


public interface EmployeeService {

	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Long empId);
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(Long empId);
	
}
