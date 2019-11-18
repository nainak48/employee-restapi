package com.nk.repository;

import org.springframework.data.repository.CrudRepository;

import com.nk.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
