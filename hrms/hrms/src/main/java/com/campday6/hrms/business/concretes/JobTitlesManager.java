package com.campday6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.campday6.hrms.business.abstracts.JobTitlesService;
import com.campday6.hrms.dataAccess.abstracts.JobTitleDao;
import com.campday6.hrms.entities.concretes.JobTitles;

public class JobTitlesManager implements JobTitlesService{


	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitlesManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitles> getAll() {
		return this. jobTitleDao.getAll();
	}

	@Override
	public void Add(JobTitles jobTitles) {
		jobTitleDao.add(jobTitles);
		System.out.println(jobTitles.getJobName() + " isimli iş veritabanına eklendi");
		
	}
	
}