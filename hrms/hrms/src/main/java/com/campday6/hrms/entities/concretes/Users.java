package com.campday6.hrms.entities.concretes;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Users")

public class Users {
	
	@Column(name = "Users_Id")
	private int id;
	
	@Column(name = "Users_E-Mail")
	private int email;
	
	@Column(name = "Users_Password")
	private int Password;
	
	@Column(name = "Users_PasswordRepetition")
	private int passwordRepetition;
	
	public Users() {
		
	}
	
	

	public Users(int id, int email, int password, int passwordRepetition) {
		super();
		this.id = id;
		this.email = email;
		Password = password;
		this.passwordRepetition = passwordRepetition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	public int getPasswordRepetition() {
		return passwordRepetition;
	}

	public void setPasswordRepetition(int passwordRepetition) {
		this.passwordRepetition = passwordRepetition;
	}
	
	
	
	
}
