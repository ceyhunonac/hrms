package com.campday6.hrms.dataAccess.abstracts;

import java.util.List;

import com.campday6.hrms.entities.concretes.Employers;

public interface EmployerDao {
	
	void add(Employers employers);
	void delete(Employers employers);
	void update(Employers employers);
	List<Employers > getAll();

}
