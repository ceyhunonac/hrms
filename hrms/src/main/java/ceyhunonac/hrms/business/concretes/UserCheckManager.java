package ceyhunonac.hrms.business.concretes;

import ceyhunonac.hrms.business.abtsracts.UserCheckService;
import ceyhunonac.hrms.entities.concretes.Employer;
import ceyhunonac.hrms.entities.concretes.JobSeeker;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean emailCheck(JobSeeker jobSeeker) {
		String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if(jobSeeker.getEmail().matches(emailPattern)==true) {
			return true;
		}else {
		System.out.println("The email entered is incorrect. Please fix it.Email: "+ jobSeeker.getEmail());
		return false;
		}
	}

	
	@Override
	public boolean employerEmailCheck(Employer employer) {
		String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if(employer.getDomainMail().matches(emailPattern)==true) {
			return true;
		}else {
		System.out.println("The email entered is incorrect. Please fix it.Email: "+ employer.getDomainMail());
		return false;
		}
	}

	@Override
	public boolean userCheck(Employer employer) {
		if(employer.getDomainMail() == null) {
			return false;
		}else {
		System.out.println("A verification link has been sent to the email you entered."
				+ " After the verification process is over, the registration will be completed.Email: "+employer.getDomainMail());	
		return true;
		}
	}
}
	
