package com.tectoro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tectoro.model.Deparment;
import com.tectoro.repository.DepartmentRepo;

@Service
public class DepartmentImpliment implements DeparInterface{

	@Autowired
	private DepartmentRepo departmentRepo1;
	private Optional<Deparment> findById;
	@Override
	public Deparment addDepartment(@RequestBody Deparment  department) {
		
		return departmentRepo1.save(department);
		
		
	}
	@Override
	public Optional<Deparment> findbyId(int id) {
		Optional<Deparment> byId = departmentRepo1.findById(id);
		return byId;
		
	}
	@Override
	public List<Deparment> findall() {
		return departmentRepo1.findAll();
		
	}
	public void updateByroll(int roll, Deparment deparment)
	{
		Optional<Deparment> id = departmentRepo1.findById(roll);
		departmentRepo1.save(deparment);
		
		
		System.out.println("upadte hjkchdsuicbkbc"+id);
	}
	@Override
	public void delete(int roll) {
		departmentRepo1.deleteById(roll);
		
	}
	@Override
	public Deparment findByName(String names) {
		
	//	System.out.println(departmentRepo1.findByName(names));
		return departmentRepo1.findByName(names);
	}
	@Override
	public Deparment findname(String name) 
	{
		System.out.println("chinnu  ");
		return departmentRepo1.findname(name);
		
		
	}
	

}
