package com.capgemini.model;

import javax.persistence.*;

@Entity
public class Documents {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String photo;
  String idProof;
  String addressProof;
 
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getIdProof() {
    return idProof;
  }

  public void setIdProof(String idProof) {
    this.idProof = idProof;
  }

  public String getAddressProof() {
    return addressProof;
  }

  public void setAddressProof(String addressProof) {
    this.addressProof = addressProof;
  }

  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Documents() {
	super();
}

@Override
  public String toString() {
    return "Documents{" +
            "photo='" + photo + '\'' +
            ", idProof='" + idProof + '\'' +
            ", addressProof='" + addressProof + '\'' +
            '}';
  }
}
