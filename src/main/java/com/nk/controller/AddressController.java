package com.nk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nk.model.Address;
import com.nk.model.Employee;
import com.nk.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addrService;

	@RequestMapping("/employees/{empId}/address")
	public List<Address> getAllAddress(@PathVariable Integer empId) {
		return addrService.getAllAddresses(empId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees/{empId}/address")
	public void addAddress(@RequestBody Address address, @PathVariable Integer empId) {
		address.setEmployee(new Employee(empId, "", "", 0.0));
		addrService.addAddress(address);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employees/{empId}/address/{addrId}")
	public Address getAddressById(@PathVariable Integer addrId) {
		return addrService.getAddressById(addrId);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{empId}/address/{addrId}")
	public void updateAddress(@RequestBody Address addr, @PathVariable Integer empId, @PathVariable Integer addrId) {
		addr.setEmployee(new Employee(empId, "", "", 0.0));
		addrService.updateAddress(addr);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{empId}/address/{addrId}")
	public void deleteAddress(@PathVariable Integer addrId) {
		addrService.deleteAddress(addrId);
	}

}