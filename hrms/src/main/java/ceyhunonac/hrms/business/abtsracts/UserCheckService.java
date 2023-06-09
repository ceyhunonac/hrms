package ceyhunonac.hrms.business.abtsracts;

import ceyhunonac.hrms.entities.concretes.*;

public interface UserCheckService {

	
	boolean emailCheck(JobSeeker jobSeeker);
	boolean employerEmailCheck(Employer employer);
	boolean userCheck(Employer employer);
	
}
