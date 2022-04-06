package com.fragmadata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fragmadata.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
