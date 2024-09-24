package com.example.labs.controller;


import com.example.labs.model.Employees;
import com.example.labs.model.Payroll;
import com.example.labs.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService employeeService;

    @PostMapping
    public ResponseEntity<Employees> createEmployee(@RequestBody Employees employee) {
        Employees createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.ok(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<Employees>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employees> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PostMapping("/{employeeId}/payroll")
    public ResponseEntity<Payroll> createPayroll(@PathVariable Long employeeId, @RequestBody Payroll payroll) {
        Payroll createdPayroll = employeeService.createPayrollForEmployee(employeeId, payroll);
        return ResponseEntity.ok(createdPayroll);
    }

    @GetMapping("/{employeeId}/payroll")
    public ResponseEntity<Payroll> getPayrollByEmployeeId(@PathVariable Long employeeId) {
        return ResponseEntity.ok(employeeService.getPayrollByEmployeeId(employeeId));
    }
}

