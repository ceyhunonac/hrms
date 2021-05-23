package com.campday6.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employers")


public class Employers extends Users {
	
	@Column(name = "Employers_CompanyName")
	private String companyName;
	
	@Column(name = "Employers_WebSite")
	private String webSite;
	
	@Column(name = "Employers_Phone")
	private String phone;
	
	public Employers() {
		
	}

	

	public Employers(String companyName, String webSite, String phone) {
		super();
		this.companyName = companyName;
		this.webSite = webSite;
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	


}
