package com.capgemini.model;

import javax.persistence.*;

@Entity
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  String applicationNummber;
  
  //@Temporal(TemporalType.DATE)
  String applicationDate;
  String modeOfPayment;
  double amountPaid;
  String paymentStatus;
  String remarks;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "document_id")
  private Documents documents;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "driving_id")
  private DrivingLicense drivingLicense;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "rto_id")
  private RTOOffice rtoOffice;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "applicant_id")
  private Applicant applicant;


  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "appointment_id", referencedColumnName = "id")
  private Appointment appointment;

  public DrivingLicense getDrivingLicense() {
    return drivingLicense;
  }

  public void setDrivingLicense(DrivingLicense drivingLicense) {
    this.drivingLicense = drivingLicense;
  }

  public RTOOffice getRtoOffice() {
    return rtoOffice;
  }

  public void setRtoOffice(RTOOffice rtoOffice) {
    this.rtoOffice = rtoOffice;
  }

  public Applicant getApplicant() {
    return applicant;
  }

  public void setApplicant(Applicant applicant) {
    this.applicant = applicant;
  }

  public Appointment getAppointment() {
    return appointment;
  }

  public void setAppointment(Appointment appointment) {
    this.appointment = appointment;
  }

  public Documents getDocuments() {
    return documents;
  }

  public void setDocuments(Documents documents) {
    this.documents = documents;
  }

  //TODO: Application Constructor
  public String getApplicationNummber() {
    return applicationNummber;
  }

  public void setApplicationNummber(String applicationNummber) {
    this.applicationNummber = applicationNummber;
  }

  public String getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(String applicationDate) {
    this.applicationDate = applicationDate;
  }

  public String getModeOfPayment() {
    return modeOfPayment;
  }

  public void setModeOfPayment(String modeOfPayment) {
    this.modeOfPayment = modeOfPayment;
  }

  public double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
  }

  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  @Override
  public String toString() {
    return "Application{" +
            "applicationNummber='" + applicationNummber + '\'' +
            ", applicationDate='" + applicationDate + '\'' +
            ", modeOfPayment='" + modeOfPayment + '\'' +
            ", amountPaid=" + amountPaid +
            ", paymentStatus='" + paymentStatus + '\'' +
            ", remarks='" + remarks + '\'' +
            '}';
  }
}
