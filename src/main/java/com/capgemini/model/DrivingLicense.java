package com.capgemini.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DrivingLicense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	String drivingLicenseNumber;
	@Temporal(TemporalType.DATE)
	Date dateOfIssue;
	@Temporal(TemporalType.DATE)
	Date validTill;
	// TODO: Driving License Constructor

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rto_office")
	private RTOOffice rtoOffice;

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RTOOffice getRtoOffice() {
		return rtoOffice;
	}

	public void setRtoOffice(RTOOffice rtoOffice) {
		this.rtoOffice = rtoOffice;
	}

	@Override
	public String toString() {
		return "DrivingLicense{" + "drivingLicenseNumber='" + drivingLicenseNumber + '\'' + ", dateOfIssue="
				+ dateOfIssue + ", validTill=" + validTill + '}';
	}
}
