package com.capgemini.model;

import javax.persistence.*;

@Entity
public class Challan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	String challanNumber;
	String vehicleNumber;
	double amount;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "challan_id")
	private Applicant applicant;
	public String getChallanNumber() {
		return challanNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public void setChallanNumber(String challanNumber) {
		this.challanNumber = challanNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Challan{" + "challanNumber='" + challanNumber + '\'' + ", vehicleNumber='" + vehicleNumber + '\''
				+ ", amount=" + amount + '}';
	}
}
