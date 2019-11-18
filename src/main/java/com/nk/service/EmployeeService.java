package com.nk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.model.Employee;
import com.nk.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	public List<Employee> getAllEmpDetails() {
		List<Employee> empList = new ArrayList<>();
		empRepository.findAll().forEach(empList::add);
		return empList;
	}

	public Employee getEmpDetailsById(Integer id) {
		return empRepository.findOne(id);
	}

	public void addEmpDetails(Employee emp) {
		empRepository.save(emp);
	}

	public void updateEmpDetails(Employee emp) {
		empRepository.save(emp);
	}

	public void deleteEmpDetails(Integer id) {
		empRepository.delete(id);
	}

	public void deleteAllEmpDetails() {
		empRepository.deleteAll();
	}
}
