package ceyhunonac.hrms.entities.concretes;

import java.sql.Date;

import ceyhunonac.hrms.entities.abstracts.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="JobSeekers")
public class JobSeeker extends User {
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="tcNo")
	private String tcNo;
	
	@Column(name="yearOfBirth")
	private int birthYear;
	
	@Column(name="email")
	private String email;
	
	
	public JobSeeker() {
		
	}

	public JobSeeker(String name, String surname, String tcNo, int birthYear, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
		this.email = email;
	}

}
