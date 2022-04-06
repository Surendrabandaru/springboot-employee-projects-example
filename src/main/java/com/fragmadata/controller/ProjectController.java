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
import com.fragmadata.entity.Project;
import com.fragmadata.service.IEmployeeService;
import com.fragmadata.service.IProjectService;
import com.fragmadata.vo.EmployeeResponse;
import com.fragmadata.vo.ProjectRequest;
import com.fragmadata.vo.ProjectResponse;

@RestController
@RequestMapping("/p1")
public class ProjectController {

	@Autowired
	private IProjectService service;

	@PostMapping("/project")
	public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request) {

		ResponseEntity<ProjectResponse> responseEntity = null;
		ProjectResponse response = new ProjectResponse();

		Project pro = service.createProject(request);

		if (pro != null) {
			response.setPid(pro.getPid());
			response.setStatus("success");
			responseEntity = new ResponseEntity<ProjectResponse>(response, HttpStatus.CREATED);
		} else {
			response.setStatus("failure");
			responseEntity = new ResponseEntity<ProjectResponse>(response, HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@GetMapping("/project/{pid}")
	public ResponseEntity<ProjectResponse> findById(@PathVariable Integer pid) {

		ProjectResponse response = new ProjectResponse();

		Project proj = service.findByProjectId(pid);

		if (proj != null) {
			response.setPid(proj.getPid());
			response.setStatus("success");
			return new ResponseEntity<ProjectResponse>(response, HttpStatus.OK);
		}
		response.setStatus("failure");
		List<String> list = new ArrayList<>();
		list.add("Project id not found");
		response.setError(list);
		return new ResponseEntity<ProjectResponse>(response, HttpStatus.NOT_FOUND);

	}

	@GetMapping("/allprojects")
	public ResponseEntity<ProjectResponse> findAllProjects() {

		ProjectResponse response = new ProjectResponse();

		List<Project> listProj = service.findAllProjects();

		if (listProj != null & !listProj.isEmpty()) {
			List<Integer> list = listProj.parallelStream().map(i -> i.getPid()).collect(Collectors.toList());
			response.setPid(list);
			response.setStatus("success");
			return new ResponseEntity<ProjectResponse>(response, HttpStatus.OK);
		}
		response.setStatus("failure");
		List<String> list = new ArrayList<>();
		list.add("Projects are not available");
		response.setError(list);
		return new ResponseEntity<ProjectResponse>(response, HttpStatus.NOT_FOUND);

	}
}
