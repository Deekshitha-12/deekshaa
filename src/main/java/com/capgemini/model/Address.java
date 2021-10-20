package com.capgemini.model;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String state;
	String city;
	String house;
	String landmark;
	String pincode;

	public Address(String state, String city, String house, String landmark, String pincode) {
		this.state = state;
		this.city = city;
		this.house = house;
		this.landmark = landmark;
		this.pincode = pincode;
	}

	public Address() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address{" + "state='" + state + '\'' + ", city='" + city + '\'' + ", house='" + house + '\''
				+ ", landmark='" + landmark + '\'' + ", pincode='" + pincode + '\'' + '}';
	}
}
