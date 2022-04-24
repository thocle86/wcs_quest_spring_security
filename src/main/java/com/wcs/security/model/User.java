package com.wcs.security.model;

import org.springframework.security.crypto.password.PasswordEncoder;

public class User {
	
	private String username;
	
	private PasswordEncoder password;
	
	private String[] roles;
	
	public User() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public PasswordEncoder getPassword() {
		return password;
	}

	public void setPassword(PasswordEncoder password) {
		this.password = password;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

}
