package com.campday6.hrms.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import com.campday6.hrms.dataAccess.abstracts.SystemEmployeerDao;

import com.campday6.hrms.entities.concretes.SystemEmployees;

public class SystemEmployeerDaoManager implements SystemEmployeerDao {

	 public List<SystemEmployees> systemEmployees;

	   public  SystemEmployeerDaoManager(){
	       this.systemEmployees = new ArrayList<SystemEmployees>();
	   }

	@Override
	public void add(SystemEmployees systemEmployees) {
		 this.systemEmployees.add(systemEmployees);
	       System.out.println(systemEmployees.getUserName() + " isimli sistem personeli veritabanına eklenmiştir.");
		
	}

	@Override
	public void delete(SystemEmployees systemEmployees) {
		 this.systemEmployees.remove(systemEmployees);
	       System.out.println(systemEmployees.getUserName() + " isimli sistem personeli  veritabanından silinmiştir.");
		
	}

	@Override
	public void update(SystemEmployees systemEmployees) {
	     System.out.println(systemEmployees.getUserName() + " isimli sistem personeli veritabanında güncellenmiştir.");
		
	}

	@Override
	public List<SystemEmployees> getAll() {
		
		return this.systemEmployees;
	}

}
