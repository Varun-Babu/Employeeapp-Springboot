package com.example.employeeapp2.Dao;

import com.example.employeeapp2.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
