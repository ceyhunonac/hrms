package ceyhunonac.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceyhunonac.hrms.business.abtsracts.JobPositionService;
import ceyhunonac.hrms.entities.concretes.JobPosition;


@RestController
@RequestMapping("/api/jobPositions") 
public class JobPositionsController {
	
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService){
		
		this.jobPositionService = jobPositionService;
	}


	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
		

}
