package com.campday6.hrms.dataAccess.abstracts;

import java.util.List;

import com.campday6.hrms.entities.concretes.Users;

public interface UserDao {
	
	void add(Users users);
	void delete(Users users);
	void update(Users users);
	List<Users> getAll();
    

}
