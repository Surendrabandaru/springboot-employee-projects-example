package com.fragmadata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fragmadata.dao.ProjectRepo;
import com.fragmadata.entity.Employee;
import com.fragmadata.entity.Project;
import com.fragmadata.vo.ProjectRequest;

@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	private ProjectRepo prepo;
	
	@Override
	public Project createProject(ProjectRequest request) {
		Project proj = new Project();
		proj.setPname(request.getpName());
		proj.setDescription(request.getDescription());
		proj.setStatus(request.getStatus());
		Project projres = prepo.saveAndFlush(proj);
		return projres;
	}

	@Override
	public Project findByProjectId(Integer pid) {
		Optional<Project> proj =  prepo.findById(pid);
		if(proj.isPresent()){
			return proj.get();
		}
		return null;
	}

	@Override
	public List<Project> findAllProjects() {
		
		return prepo.findAll();
	}

}
