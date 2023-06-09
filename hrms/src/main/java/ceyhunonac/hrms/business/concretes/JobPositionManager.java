package ceyhunonac.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ceyhunonac.hrms.business.abtsracts.JobPositionService;
import ceyhunonac.hrms.dataAccess.abstracts.JobPositionDao;
import ceyhunonac.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public void addJob(JobPosition jobPosition) {
		System.out.println("Job Position added: "+ jobPosition.getJobName());
		
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}
	
	

}
