package com.swang.dao;

import com.swang.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by swang on 2/18/2016.
 */
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
