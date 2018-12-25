package com.example.RestProject.dao;

import com.example.RestProject.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findAll();
}
