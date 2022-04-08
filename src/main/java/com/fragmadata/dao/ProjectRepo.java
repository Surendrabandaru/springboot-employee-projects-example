package com.fragmadata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fragmadata.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
