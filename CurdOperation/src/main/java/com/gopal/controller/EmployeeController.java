package com.gopal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.entity.Employee;
import com.gopal.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
		
		}
	
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable Long empId) {
		return employeeService.getEmployeeById(empId);
		
	   }
	
	//Endpoint to add a new employee
	
	@PostMapping
	public void addEmployee(@RequestBody Employee employee) {
		
		employeeService.addEmployee(employee);
		
	}
	
	//EndPoint to update an existing employee
	@PutMapping("/{empId}")
	public void updateEmployee(@PathVariable Long empId, @RequestBody Employee employee) {
		
		Employee existingEmployee = employeeService.getEmployeeById(empId);
	  	if(existingEmployee!= null) {
	  		
	  		existingEmployee.setEmpName(employee.getEmpName());
	  		existingEmployee.setSalary(employee.getSalary());
	  		employeeService.updateEmployee(existingEmployee);
	  		
	  	}
	}
	
	@DeleteMapping("/{empId}")
	public void deleteEmployee(@PathVariable Long empId) {
		
		employeeService.deleteEmployee(empId);
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


