package ceyhunonac.hrms.entities.abstracts;

import jakarta.persistence.Column;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="User")
public class User {
	
	@Column(name="password")
	private String password;
	
	@Column(name="passwordRepeat")
	private String passwordRepeat;
	
	public User() {
		
	}
	
	public User(String password, String passwordRepeat) {
		super();
		this.password = password;
		this.passwordRepeat = passwordRepeat;
	}
		
	

}
