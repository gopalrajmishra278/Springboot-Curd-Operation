package com.gopal.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

}
