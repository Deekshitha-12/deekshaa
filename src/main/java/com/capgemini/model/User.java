package com.capgemini.model;

import javax.persistence.*;

@Entity
@Table(name = "user_details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "email_id")
	String email;
	@Column(name = "password")
	String password;

	// TODO: User Constructor
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User{" + "email='" + email + '\'' + ", password='" + password + '\'' + '}';
	}
}
