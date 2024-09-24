package com.example.labs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.labs.model.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Long> {

}
