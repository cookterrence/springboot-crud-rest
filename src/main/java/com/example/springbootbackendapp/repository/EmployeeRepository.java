package com.example.springbootbackendapp.repository;

import com.example.springbootbackendapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
