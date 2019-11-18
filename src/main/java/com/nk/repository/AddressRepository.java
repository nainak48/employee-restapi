package com.nk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nk.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

	List<Address> findByEmployeeEmpId(Integer empId);

}
