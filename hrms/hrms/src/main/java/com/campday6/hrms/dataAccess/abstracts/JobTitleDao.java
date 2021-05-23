package com.campday6.hrms.dataAccess.abstracts;

import java.util.List;

import com.campday6.hrms.entities.concretes.JobTitles;

public interface JobTitleDao {
	void add(JobTitles jobTitles);
	void delete(JobTitles jobTitles);
	void update(JobTitles jobTitles);
	List<JobTitles> getAll();

}
