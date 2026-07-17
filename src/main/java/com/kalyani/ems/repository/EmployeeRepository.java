package com.kalyani.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kalyani.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}