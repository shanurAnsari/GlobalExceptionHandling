package com.example.transaction.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
