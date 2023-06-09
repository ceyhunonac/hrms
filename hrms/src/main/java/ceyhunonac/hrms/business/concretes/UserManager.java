package ceyhunonac.hrms.business.concretes;

import ceyhunonac.hrms.business.abtsracts.UserService;
import ceyhunonac.hrms.core.MernisServiceAdapter;
import ceyhunonac.hrms.dataAccess.abstracts.UserDao;
import ceyhunonac.hrms.entities.concretes.Employer;
import ceyhunonac.hrms.entities.concretes.JobSeeker;

public class UserManager implements UserService {
	
	private UserCheckManager userCheckManager;
	private MernisServiceAdapter mernisServiceAdapter;
	private UserDao userDao;
	
	public UserManager(UserCheckManager userCheckManager, MernisServiceAdapter mernisServiceAdapter, UserDao userDao) {
		super();
		this.userCheckManager = userCheckManager;
		this.mernisServiceAdapter = mernisServiceAdapter;
		this.userDao = userDao;
	}


	@Override
	public void seekerSignUp(JobSeeker jobSeeker) {
		if(this.userCheckManager.emailCheck(jobSeeker) && this.mernisServiceAdapter.checkRealPerson(jobSeeker)) {
			System.out.println("Verifications was successful.You signed up under the following name: "+ jobSeeker.getName()+" "+jobSeeker.getSurname());
		}else {
			System.out.println("Registration failed.Please check the information you have entered.");
		}
		System.out.println("-----------------");
		
	}

	@Override
	public void employerSignUp(Employer employer) {
		if(this.userCheckManager.employerEmailCheck(employer) && this.userCheckManager.userCheck(employer)) {
			System.out.println("Verifications was successful.You signed up under the following name: "+ employer.getCompanyName());
		}else {
			System.out.println("Registration failed.Please check the information you have entered.");
		}

	}

	

}
