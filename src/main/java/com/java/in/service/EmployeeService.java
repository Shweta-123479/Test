package com.java.in.service;

import com.java.in.dao.EmpRepository;
import com.java.in.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmpRepository empRepository;

    //1. Create Employee
    public Employee saveEmployee(Employee employee)
    {
        return empRepository.save(employee);
    }
    //2. get all employees
    public Page<Employee> getEmployees(int page, int size)
    {
        Pageable pageable = PageRequest.of(page, size);
        return empRepository.findAll(pageable);
    }
    public Employee getEmployeeById(Long empId)
    {
         return empRepository.findById(empId).orElse(null);
    }
    public void deleteEmployee(Long empId)
    {
        empRepository.deleteById(empId);
    }
}
