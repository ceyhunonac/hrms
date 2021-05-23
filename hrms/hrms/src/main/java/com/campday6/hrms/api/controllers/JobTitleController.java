package com.campday6.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campday6.hrms.business.abstracts.JobTitlesService;
import com.campday6.hrms.entities.concretes.JobTitles;



@RestController
@RequestMapping("/job/positions")
public class JobTitleController {
	
	
	private JobTitlesService jobTitlesService;  
	
	
	
	
	public JobTitleController(JobTitlesService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}




	@GetMapping("/getall")
	public List<JobTitles> getAll(){
		 return this.jobTitlesService.getAll();
	}
	
}