package com.fragmadata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fragmadata.dao.ProjectEmployeeRepo;
import com.fragmadata.entity.ProjectEmployee;
import com.fragmadata.vo.ProjectEmployeeRequest;

@Service
public class ProjectEmployeeServiceImpl implements IProjectEmployeeService {
	
	
	
	@Autowired
	private ProjectEmployeeRepo proEmpRepo;
	

	@Override
	public ProjectEmployee createProjectEmployee(ProjectEmployeeRequest request) {
		ProjectEmployee projEmp = new ProjectEmployee();
		projEmp.setPid(request.getpId());
		projEmp.setEid(request.geteId());
		projEmp.setStatus(request.getStatus());
		projEmp.setStartDate(request.getStartDate());
		ProjectEmployee projres = proEmpRepo.saveAndFlush(projEmp);
		return projres;
	}

	@Override
	public int updateProjectEmployeeStatus(ProjectEmployeeRequest request) {
		ProjectEmployee projEmp = new ProjectEmployee();
		projEmp.setEndDate(request.getEndDate());
		projEmp.setEid(request.geteId());
        projEmp.setStatus(request.getStatus());
		return proEmpRepo.updateProjectEmployeeStatus(projEmp.getEndDate(), projEmp.getStatus(), projEmp.getEid());
	}

}
