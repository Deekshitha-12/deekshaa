package com.capgemini.model;

import javax.persistence.*;

@Entity
public class RTOOfficer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String username;
	String password;
	String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rto_office")
	private RTOOffice rtoOffice;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "appointment_id")
	private Appointment appointment;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	// TODO: RTO Officer Constructor

	@Override
	public String toString() {
		return "RTOOfficer{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", email='" + email
				+ '\'' + '}';
	}

	public RTOOffice getRtoOffice() {
		return rtoOffice;
	}

	public void setRtoOffice(RTOOffice rtoOffice) {
		this.rtoOffice = rtoOffice;
	}
}
