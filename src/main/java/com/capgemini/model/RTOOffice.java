package com.capgemini.model;

import javax.persistence.*;

@Entity
public class RTOOffice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rtoName;

	public RTOOffice() {
		super();
		// TODO Auto-generated constructor stub
	}

//TODO: RTO Office Constructor
	public int getRtoId() {
		return id;
	}

	public void setRtoId(int rtoId) {
		this.id = rtoId;
	}

	public String getRtoName() {
		return rtoName;
	}

	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
	}

	@Override
	public String toString() {
		return "RTOOffice{" + "rtoId=" + id + ", rtoName='" + rtoName + '\'' + '}';
	}
}
