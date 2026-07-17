package com.kalyani.ems.service;

import java.util.List;

import com.kalyani.ems.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee employee, Long id);

    void deleteEmployee(Long id);

}