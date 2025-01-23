package com.practice.restcrudproject.dao;

import com.practice.restcrudproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
