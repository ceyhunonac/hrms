package ceyhunonac.hrms.business.abtsracts;

import java.util.List;

import ceyhunonac.hrms.entities.concretes.JobPosition;


public interface JobPositionService {
	
	void addJob(JobPosition jobPosition);
	
	List<JobPosition> getAll();

}
