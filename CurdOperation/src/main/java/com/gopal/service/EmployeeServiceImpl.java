package com.gopal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.gopal.entity.Employee;
import com.gopal.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		
	    return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		
		Optional<Employee> optionalEmployee = employeeRepository.findById(empId);
		return optionalEmployee.orElse(null);
	}

	@Override
	public void addEmployee(Employee employee) {

		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
       
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long empId) {
	     
		employeeRepository.deleteById(empId);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
