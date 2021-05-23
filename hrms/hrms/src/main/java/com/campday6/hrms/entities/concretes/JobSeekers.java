package com.campday6.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="JobSeekers")


public class JobSeekers extends Users {
	
	@Column(name = "JobSeekers_FirstName")
	private String firstName;
	
	
	@Column(name = "JobSeekers_LastName")
	private String lastName;
	
	@Column(name = "JobSeekers_TrNu")
	private String TrNu;
	
	@Column(name = "JobSeekers_BirthYear")
	private int birthYear;
	
	@Column(name = "isCompanyEmplooyer")
	private boolean isCompanyEmplooyer;
	
	
	
	
	public JobSeekers() {
	
	}
	
	

	public JobSeekers(String firstName, String lastName, String trNu, int birthYear, boolean isCompanyEmplooyer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		TrNu = trNu;
		this.birthYear = birthYear;
		this.isCompanyEmplooyer = isCompanyEmplooyer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTrNu() {
		return TrNu;
	}

	public void setTrNu(String trNu) {
		TrNu = trNu;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public boolean isCompanyEmplooyer() {
		return isCompanyEmplooyer;
	}

	public void setCompanyEmplooyer(boolean isCompanyEmplooyer) {
		this.isCompanyEmplooyer = isCompanyEmplooyer;
	}
}
