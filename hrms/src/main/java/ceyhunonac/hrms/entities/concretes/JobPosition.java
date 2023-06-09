package ceyhunonac.hrms.entities.concretes;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="JobPositions")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="JobId")	
	private int jobId;
	
	@Column(name="JobName")
	private String jobName;
	
	public JobPosition() {
		
	}
	public JobPosition(int jobId, String jobName) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
	}

}
