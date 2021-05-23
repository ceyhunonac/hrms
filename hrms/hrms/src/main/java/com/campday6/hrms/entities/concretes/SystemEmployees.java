package com.campday6.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="SystemEmployees")

public class SystemEmployees extends Users {
	

		
	@Column(name = "SystemEmployees_UserName")
	private String userName;

	public SystemEmployees() {
		
	}

	
	
	public SystemEmployees(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
		
		
	

}
