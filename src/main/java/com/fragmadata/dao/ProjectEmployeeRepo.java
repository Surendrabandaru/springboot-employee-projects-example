package com.fragmadata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fragmadata.entity.ProjectEmployee;

@Repository
public interface ProjectEmployeeRepo extends JpaRepository<ProjectEmployee, Integer> {
	
	@Transactional
	@Modifying
    @Query("update ProjectEmployee pe set pe.endDate = ?1, pe.status = ?2 where pe.eid = ?3")
    int updateProjectEmployeeStatus(String date, String status, int id);

}
