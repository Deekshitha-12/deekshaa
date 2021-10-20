package com.capgemini.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	String appointmentNumber;
	String timeSlot;
	String testResult;
	Date testDate;

	// TODO: Appointment Constructor
	public String getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(String appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Appointment() {
		super();
	}

	@Override
	public String toString() {
		return "Appointment{" + "appointmentNumber='" + appointmentNumber + '\'' + ", timeSlot='" + timeSlot + '\''
				+ ", testResult='" + testResult + '\'' + ", testDate=" + testDate + '}';
	}
}
