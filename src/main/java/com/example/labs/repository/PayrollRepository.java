package com.example.labs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.labs.model.Payroll;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll,Long> {

}
