package com.alexeymiroshnikov.spring.mvc_hib_aop.service;

import com.alexeymiroshnikov.spring.mvc_hib_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
