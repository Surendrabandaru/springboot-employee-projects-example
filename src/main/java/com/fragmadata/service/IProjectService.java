package com.fragmadata.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.fragmadata.entity.Project;
import com.fragmadata.vo.ProjectRequest;

@Service
public interface IProjectService {

	Project createProject(ProjectRequest request);

	Project findByProjectId(Integer pid);

	List<Project> findAllProjects();

}
