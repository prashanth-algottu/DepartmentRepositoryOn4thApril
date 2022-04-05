package com.tectoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tectoro.model.Deparment;

@Repository
public interface DepartmentRepo extends JpaRepository<Deparment, Integer>{

	public Deparment findByName(String name);
	
	@Query(value = "select * from Deparment where name=?" )
	public Deparment findname(String name);
}
