package com.fragmadata.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fragmadata.entity.Employee;
import com.fragmadata.service.IEmployeeService;
import com.fragmadata.vo.EmployeeRequest;
import com.fragmadata.vo.EmployeeResponse;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@PostMapping("/employee")
	public ResponseEntity<EmployeeResponse> create(@RequestBody EmployeeRequest request) {

		EmployeeResponse response = new EmployeeResponse();

		Employee emp = service.create(request);

		if (emp != null) {
			response.setEid(emp.getEid());
			response.setStatus("success");
			return new ResponseEntity<EmployeeResponse>(response, HttpStatus.CREATED);
		}
		response.setStatus("failure");
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/employee/{eid}")
	public ResponseEntity<EmployeeResponse> findById(@PathVariable Integer eid) {

		EmployeeResponse response = new EmployeeResponse();

		Employee emp = service.findByEmployeeId(eid);

		if (emp != null) {
			response.setEid(emp.getEid());
			response.setStatus("success");
			return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
		}
		response.setStatus("failure");
		List<String> list = new ArrayList<>();
		list.add("Employee id not found in system");
		response.setError(list);
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.NOT_FOUND);

	}
	
	@GetMapping("/employee")
	public ResponseEntity<EmployeeResponse> findByStatus(@RequestParam String status) {

		EmployeeResponse response = new EmployeeResponse();

		List<Employee> emp = service.findByStatus(status);
		
		StringBuffer buffer = new StringBuffer();
		
		

		if (emp != null & !emp.isEmpty()) {
			List<Integer> list = emp.parallelStream().map(i->i.getEid()).collect(Collectors.toList());
			response.setEid(list);
			response.setStatus("success");
			return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
		}
		response.setStatus("failure");
		List<String> list = new ArrayList<>();
		list.add("Employee id not found in system");
		response.setError(list);
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.NOT_FOUND);

	}
}
