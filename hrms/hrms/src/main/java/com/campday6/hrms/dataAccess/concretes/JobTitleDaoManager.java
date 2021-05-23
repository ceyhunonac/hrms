package com.campday6.hrms.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import com.campday6.hrms.dataAccess.abstracts.JobTitleDao;

import com.campday6.hrms.entities.concretes.JobTitles;


public class JobTitleDaoManager implements JobTitleDao  {

	 public List<JobTitles> jobTitles;

	   public  JobTitleDaoManager(){
	       this.jobTitles = new ArrayList<JobTitles>();
	   }

	@Override
	public void add(JobTitles jobTitles) {
		 this.jobTitles.add(jobTitles);
	       System.out.println(jobTitles.getJobName() + " isimli iş veritabanına eklenmiştir.");
		
	}

	@Override
	public void delete(JobTitles jobTitles) {
		 this.jobTitles.remove(jobTitles);
	       System.out.println(jobTitles.getJobName() + " isimli iş veritabanından silinmiştir.");
	}

	@Override
	public void update(JobTitles jobTitles) {
	     System.out.println(jobTitles.getJobName()  + " isimli iş veritabanında güncellenmiştir.");
		
	}

	@Override
	public List<JobTitles> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitles;
	}

}
