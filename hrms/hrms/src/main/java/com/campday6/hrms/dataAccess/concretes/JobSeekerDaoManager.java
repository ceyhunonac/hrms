package com.campday6.hrms.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import com.campday6.hrms.dataAccess.abstracts.JobSeekerDao;
import com.campday6.hrms.entities.concretes.JobSeekers;


public class JobSeekerDaoManager implements JobSeekerDao {
	
	 public List<JobSeekers> jobSeekers;

	   public JobSeekerDaoManager(){
	       this.jobSeekers = new ArrayList<JobSeekers>();
	   }

	@Override
	public void add(JobSeekers jobSeekers) {
		 this.jobSeekers.add(jobSeekers);
	       System.out.println(jobSeekers.getFirstName()  + " isimli kullanıcı veritabanına eklenmiştir.");
		
	}

	@Override
	public void delete(JobSeekers jobSeekers) {
		this.jobSeekers.remove(jobSeekers);
	       System.out.println(jobSeekers.getFirstName()  + " isimli kullanıcı veritabanından silinmiştir.");
		
	}

	@Override
	public void update(JobSeekers jobSeekers) {
	      System.out.println(jobSeekers.getFirstName()  + " isimli kullanıcı veritabanında güncellenmiştir.");
		
	}

	@Override
	public List<JobSeekers> getAll() {
		// TODO Auto-generated method stub
		return this.jobSeekers;
	}

}
