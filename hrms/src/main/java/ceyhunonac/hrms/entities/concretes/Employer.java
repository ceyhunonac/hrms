package ceyhunonac.hrms.entities.concretes;

import ceyhunonac.hrms.entities.abstracts.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employers")
public class Employer extends User {
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="website")
	private String website;
	
	@Column(name="domainMail")
	private String domainMail;
	
	@Column(name="phone")
	private String phone;
	
	public Employer() {
		
	}
	public Employer(String companyName, String website, String domainMail, String phone) {
		super();
		this.companyName = companyName;
		this.website = website;
		this.domainMail = domainMail;
		this.phone = phone;
	}

}
