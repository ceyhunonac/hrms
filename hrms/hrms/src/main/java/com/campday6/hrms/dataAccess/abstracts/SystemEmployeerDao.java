package com.campday6.hrms.dataAccess.abstracts;

import java.util.List;

import com.campday6.hrms.entities.concretes.SystemEmployees;

public interface SystemEmployeerDao {
	void add(SystemEmployees systemEmployees);
	void delete(SystemEmployees systemEmployees);
	void update(SystemEmployees systemEmployees);
	List<SystemEmployees> getAll();

}
