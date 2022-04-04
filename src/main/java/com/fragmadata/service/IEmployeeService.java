package com.fragmadata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fragmadata.entity.Employee;
import com.fragmadata.vo.EmployeeRequest;

@Service
public interface IEmployeeService {

	 Employee create(EmployeeRequest request);
	 Employee findByEmployeeId(Integer eid);
	 List<Employee> findByStatus(String status);
}
