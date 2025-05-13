package com.java.in.controller;

import com.java.in.entity.Employee;
import com.java.in.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //1. API create employee
    @PostMapping("/save")
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);

    }

    //2. API get all employees
    @GetMapping("/getEmployees")
    public ResponseEntity<Page<Employee>> getAllEmployee(@RequestParam(defaultValue = "0") int page,
                                                         @RequestParam(defaultValue = "5") int size)
    {
        return new ResponseEntity<>(employeeService.getEmployees(page, size), HttpStatus.OK);
    }

    @GetMapping("/getEmployeeById/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long empId)
    {
        return new ResponseEntity<>(employeeService.getEmployeeById(empId), HttpStatus.OK);
    }

    @PutMapping("getEmployeeById/{empId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long empId, @Valid @RequestBody Employee employee)
    {
        employee.setEmpId(empId);
        return new ResponseEntity<>(employeeService.saveEmployee(employee),HttpStatus.OK);
    }

    @DeleteMapping("deleteById/{empId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long empId)
    {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity<>("Employee with empId " +empId+ " Deleted successfully....!!",HttpStatus.OK);
    }

}
