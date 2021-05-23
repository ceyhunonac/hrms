package com.campday6.hrms.dataAccess.concretes;



import java.util.ArrayList;
import java.util.List;

import com.campday6.hrms.dataAccess.abstracts.UserDao;
import com.campday6.hrms.entities.concretes.Users;


public class UserDaoManager implements UserDao {
	
	
	 public List<Users> users;

	   public UserDaoManager(){
	       this.users = new ArrayList<Users>();
	   }

	@Override
	public void add(Users users) {
		 this.users.add(users);
	       System.out.println(users.getEmail() + " bu emailin sahibi olan kullanıcı veritabanına eklenmiştir.");
		
	}

	@Override
	public void delete(Users users) {
		 this.users.remove(users);
	       System.out.println(users.getEmail() + " bu emailin sahibi olan kullanıcı veritabanından silinmiştir.");
		
	}

	@Override
	public void update(Users users) {
	       System.out.println(users.getEmail() + " bu emailin sahibi olan kullanıcı veritabanında güncellenmiştir.");
		
	}

	@Override
	public List<Users> getAll() {
		
		  return this.users;
	}
	

	
}
