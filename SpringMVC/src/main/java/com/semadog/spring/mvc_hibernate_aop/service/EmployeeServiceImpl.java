package com.semadog.spring.mvc_hibernate_aop.service;

import com.semadog.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.semadog.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional(readOnly = false)
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional(readOnly = false)
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional(readOnly = false)
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);

    }

}
