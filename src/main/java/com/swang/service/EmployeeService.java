package com.swang.service;

import com.swang.domain.Employee;

import java.util.List;

/**
 * Created by swang on 2/18/2016.
 */
public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getList();
}
