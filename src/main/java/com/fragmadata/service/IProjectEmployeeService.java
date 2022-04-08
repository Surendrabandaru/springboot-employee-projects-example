package com.fragmadata.service;

import org.springframework.stereotype.Service;

import com.fragmadata.entity.ProjectEmployee;
import com.fragmadata.vo.ProjectEmployeeRequest;

@Service
public interface IProjectEmployeeService {
	
	ProjectEmployee createProjectEmployee(ProjectEmployeeRequest request);
	int updateProjectEmployeeStatus(ProjectEmployeeRequest request);

}
