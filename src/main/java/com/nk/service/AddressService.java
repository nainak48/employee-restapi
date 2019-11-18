package com.nk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.model.Address;
import com.nk.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addrRepository;

	public List<Address> getAllAddresses(Integer empId) {
		return addrRepository.findByEmployeeEmpId(empId);
	}

	public Address getAddressById(Integer addrId) {
		return addrRepository.findOne(addrId);
	}

	public void addAddress(Address addr) {
		addrRepository.save(addr);
	}

	public void updateAddress(Address addr) {
		addrRepository.save(addr);
	}

	public void deleteAddress(Integer addrId) {
		addrRepository.delete(addrId);
	}

}
