package com.fragmadata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fragmadata.dao.EmployeeRepo;
import com.fragmadata.entity.Employee;
import com.fragmadata.vo.EmployeeRequest;

@Service
public class EmployyServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Employee create(EmployeeRequest request) {
		
		Employee employee = new Employee();
		employee.setEname(request.getEmployeeName());
		employee.setDesignation(request.getDesignation());
		employee.setStatus(request.getStatus());
		Employee emp = repo.saveAndFlush(employee);
		return emp;
	}

	@Override
	public Employee findByEmployeeId(Integer eid) {
		Optional<Employee> emp =  repo.findById(eid);
		if(emp.isPresent()){
			return emp.get();
		}
		return null;
	}

	@Override
	public List<Employee> findByStatus(String status) {
		return repo.findByStatus(status);
		
	}

}
