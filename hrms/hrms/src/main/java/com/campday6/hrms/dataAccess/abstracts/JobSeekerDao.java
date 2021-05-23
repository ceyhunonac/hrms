package com.campday6.hrms.dataAccess.abstracts;

import java.util.List;

import com.campday6.hrms.entities.concretes.JobSeekers;


public interface JobSeekerDao {

	void add(JobSeekers jobSeekers);
	void delete(JobSeekers  jobSeekers);
	void update(JobSeekers  jobSeekers);
	List<JobSeekers > getAll();
}
