package com.swang.service;

import com.swang.dao.EmployeeRepository;
import com.swang.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by swang on 2/18/2016.
 */
@Service
@Validated
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private final EmployeeRepository repository;

    @Inject
    public EmployeeServiceImpl(final  EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Employee save(@NotNull @Valid final Employee employee) {

        LOGGER.debug("Creating {}", employee);
        return repository.save(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getList() {
        LOGGER.debug("Retrieving the list of all users");
        return repository.findAll();
    }
}
