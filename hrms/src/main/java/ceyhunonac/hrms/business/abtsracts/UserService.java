package ceyhunonac.hrms.business.abtsracts;


import ceyhunonac.hrms.entities.concretes.Employer;
import ceyhunonac.hrms.entities.concretes.JobSeeker;

public interface UserService {
	
	void seekerSignUp(JobSeeker jobSeeker);
	
	void employerSignUp(Employer employer);
	

}
