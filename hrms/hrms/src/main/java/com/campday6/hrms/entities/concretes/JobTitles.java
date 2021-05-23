package com.campday6.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="JobTitles")

public class JobTitles {
	
	@Column(name = "JobTitles_Id")
	private int jobTitleId;
	
	@Column(name = "JobTitles_JobName")
	private String jobName;
	
	public JobTitles() {
		
	}
	

	public JobTitles(int jobTitleId, String jobName) {
		super();
		this.jobTitleId = jobTitleId;
		this.jobName = jobName;
	}

	public int getJobTitleId() {
		return jobTitleId;
	}

	public void setJobTitleId(int jobTitleId) {
		this.jobTitleId = jobTitleId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
