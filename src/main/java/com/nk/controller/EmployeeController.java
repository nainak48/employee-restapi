package com.nk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nk.model.Employee;
import com.nk.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmpDetails() {
		return empService.getAllEmpDetails();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmpDetails(@RequestBody Employee employee) {
		empService.addEmpDetails(employee);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employees/{empId}")
	public Employee getEmpDetailsById(@PathVariable Integer empId) {
		return empService.getEmpDetailsById(empId);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{empId}")
	public void updateEmpDetails(@RequestBody Employee emp) {
		empService.updateEmpDetails(emp);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{empId}")
	public void deleteEmpDetails(@PathVariable Integer empId) {
		empService.deleteEmpDetails(empId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees")
	public void deleteAllEmpDetails() {
		empService.deleteAllEmpDetails();
	}

}