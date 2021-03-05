package com.alexeymiroshnikov.spring.mvc_hib_aop.dao;

import com.alexeymiroshnikov.spring.mvc_hib_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

}
