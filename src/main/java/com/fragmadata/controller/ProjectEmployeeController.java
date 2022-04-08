package com.fragmadata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fragmadata.entity.ProjectEmployee;
import com.fragmadata.service.IProjectEmployeeService;
import com.fragmadata.vo.ProjectEmployeeRequest;
import com.fragmadata.vo.ProjectEmployeeResponse;

@RestController
@RequestMapping("/pe1")
public class ProjectEmployeeController {

	@Autowired
	private IProjectEmployeeService service;

	@PostMapping("/projectemployee")
	public ResponseEntity<ProjectEmployeeResponse> createProjectEmployee(@RequestBody ProjectEmployeeRequest request) {

		ResponseEntity<ProjectEmployeeResponse> responseEntity = null;
		ProjectEmployeeResponse response = new ProjectEmployeeResponse();

		ProjectEmployee proEmp = service.createProjectEmployee(request);

		if (proEmp != null) {
			response.setId(proEmp.getId());
			response.setStatus("success");
			responseEntity = new ResponseEntity<ProjectEmployeeResponse>(response, HttpStatus.CREATED);
		} else {
			response.setStatus("failure");
			responseEntity = new ResponseEntity<ProjectEmployeeResponse>(response, HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}
	
	@PutMapping("/updateprojectemployee")
	public ResponseEntity<ProjectEmployeeResponse> updateProjectEmployeeStatus(@RequestBody ProjectEmployeeRequest request) {

		ResponseEntity<ProjectEmployeeResponse> responseEntity = null;
		ProjectEmployeeResponse response = new ProjectEmployeeResponse();

		int updatedId = service.updateProjectEmployeeStatus(request);
		//System.out.println("updatedId in controller ="+updatedId);

		if (updatedId > 0) {
			response.setId(request.geteId());
			response.setStatus("success");
			responseEntity = new ResponseEntity<ProjectEmployeeResponse>(response, HttpStatus.CREATED);
		} else {
			response.setStatus("failure");
			responseEntity = new ResponseEntity<ProjectEmployeeResponse>(response, HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}
	
}
