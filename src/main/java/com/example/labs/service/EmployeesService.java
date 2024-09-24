package com.example.labs.service;

import com.example.labs.model.Employees;
import com.example.labs.model.Payroll;
import com.example.labs.repository.EmployeesRepository;
import com.example.labs.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesRepository employeeRepository;

    @Autowired
    private PayrollRepository payrollRepository;

    public Employees createEmployee(Employees employee) {
        return employeeRepository.save(employee);
    }

    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employees getEmployeeById(Long id) {
        return employeeRepository.findById(id)
        		.orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Payroll createPayrollForEmployee(Long employeeId, Payroll payroll) {
        Employees employee = employeeRepository.findById(employeeId)
            .orElseThrow(() -> new RuntimeException("Employee not found"));
        payroll.setEmployee(employee);
        return payrollRepository.save(payroll);
    }

    public Payroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepository.findById(employeeId)
            .orElseThrow(() -> new RuntimeException("Payroll not found"));
    }
}

