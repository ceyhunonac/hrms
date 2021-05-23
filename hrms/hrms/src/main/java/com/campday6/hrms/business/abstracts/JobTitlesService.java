package com.campday6.hrms.business.abstracts;

import java.util.List;


import com.campday6.hrms.entities.concretes.JobTitles;


public interface JobTitlesService {
	List<JobTitles> getAll();
	
	void Add(JobTitles jobTitles);

	
	
	
}
