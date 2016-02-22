package com.swang.controller;

import com.swang.domain.Employee;
import com.swang.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by swang on 2/18/2016.
 */
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Inject
    public EmployeeController(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> listEmployees() {
        List<Employee> employees = employeeService.getList();
        return employees;
    }
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public void addEmployee(@RequestParam(value = "employeeName", required = false) String employeeName,
                            @RequestParam(value = "employeeId", required = false) String employeeId,
                            @RequestParam(value = "employeeCity", required = false) String employeeCity){
        Employee employee = new Employee(employeeId,employeeName,employeeCity);
        employeeService.save(employee);
    }
}
